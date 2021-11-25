package pl.bykowski.monitorowaniejednostekmorskich.model;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class TrackService {
    RestTemplate restTemplate = new RestTemplate();


    public List<Point> getTracks() {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IjBCM0I1NEUyRkQ5OUZCQkY5NzVERDMxNDBDREQ4OEI1QzA5RkFDRjMiLCJ0eXAiOiJhdCtqd3QiLCJ4NXQiOiJDenRVNHYyWi03LVhYZE1VRE4ySXRjQ2ZyUE0ifQ.eyJuYmYiOjE2Mzc4Njk4MjMsImV4cCI6MTYzNzg3MzQyMywiaXNzIjoiaHR0cHM6Ly9pZC5iYXJlbnRzd2F0Y2gubm8iLCJhdWQiOiJhcGkiLCJjbGllbnRfaWQiOiJwcnplbWVrQGJ5a293c2tpLnBsOmxpdmVzdHJlYW0iLCJzY29wZSI6WyJhcGkiXX0.JWE-RR1D47MP99FKDsukushTQoR0hYoLdXrAue0_nIqdrKctwXeHBtD1EQBA0bAl4Y3d3PiGuNOwQwObp1t0JgXJ_PdAXcyYhzRzl36Z1RPSlJJH9PHGDlYrI6-yVvfgAK7v3JP9rLOQf_tCvogAQGXLe52PlVhajCCkJT7ekkUv2GzwkOX26cGEsId-465CP-itKc-lP1in2sOqY3QAoOdU9-HP1-Pq5z3qGpq0OWDbWbLp9bPtDBhdNjUlDAboLeGd1sb6fwsA72jkvt0M1W5iSx_TPKIpzL8pN-KyoR-h5jwSsjaw4yiRpTuAf6DHOD4bLQefkOI-NmWDkbgnCmnOQ2QZaXG6lrSWxwOkydZw__4hIBvD10jK_dKKfOQg7E5JakhQEZONm46Tog_onNc6yYC-OdOjtBjTIB4AFCMU3SWhOvB285VSkoIDKRdsH_ZzRCIHavYXCR7uTvQQmqYbnErSeps2dFgVhwr-4E8WW-xaTW2CBP-acDMza6GgsaWxIWRnCNAnIt-3bDTZbftfFUyHsyBuzvy7gtLgths5nC50Bh1WwjjqDr4o6D8Mc9buFR4Crv-_lMcGCYIkqT74EACWdsHDVe3VI5dT5-U0NwimRAIsu90B_1Yj9thTw5aY2eghaacRAWEwToyNzF1ucJdKbCKSLmG7M0Ll5nQ");
        HttpEntity httpEntity = new HttpEntity(httpHeaders);

        ResponseEntity<Track[]> exchange = restTemplate.exchange("https://www.barentswatch.no/bwapi/v2/geodata/ais/openpositions?Xmin=10.09094&Xmax=10.67047&Ymin=63.3989&Ymax=63.58645",
                HttpMethod.GET,
                httpEntity,
                Track[].class);

        List<Point> collect = Stream.of(exchange.getBody()).map(
                track -> new Point(
                        track.getGeometry().getCoordinates().get(0),
                        track.getGeometry().getCoordinates().get(1),
                        track.getName(),
                        getDestination(track.getDestination(), track.getGeometry().getCoordinates()).getLongitude(),
                        getDestination(track.getDestination(), track.getGeometry().getCoordinates()).getLatitude()
                )
        ).collect(Collectors.toList());
        return collect;
    }

    public Datum getDestination(String destinationName, List<Double> coordinates) {
        try {
            String url = "http://api.positionstack.com/v1/forward?access_key=f9aae45e031a1e66eac64db90ffda427&query=" + destinationName;
            JsonNode data = restTemplate.getForObject(url, JsonNode.class).get("data").get(0);
            double latitude = data.get("latitude").asDouble();
            double longitude = data.get("longitude").asDouble();
            return new Datum(latitude, longitude);

        } catch (Exception ex) {
            return new Datum(coordinates.get(1), coordinates.get(0));
        }
    }
}
