
package pl.bykowski.monitorowaniejednostekmorskich.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "latitude",
    "longitude",
    "type",
    "name",
    "number",
    "postal_code",
    "street",
    "confidence",
    "region",
    "region_code",
    "county",
    "locality",
    "administrative_area",
    "neighbourhood",
    "country",
    "country_code",
    "continent",
    "label"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("type")
    private String type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("number")
    private Object number;
    @JsonProperty("postal_code")
    private Object postalCode;
    @JsonProperty("street")
    private Object street;
    @JsonProperty("confidence")
    private Integer confidence;
    @JsonProperty("region")
    private String region;
    @JsonProperty("region_code")
    private String regionCode;
    @JsonProperty("county")
    private String county;
    @JsonProperty("locality")
    private String locality;
    @JsonProperty("administrative_area")
    private String administrativeArea;
    @JsonProperty("neighbourhood")
    private Object neighbourhood;
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("continent")
    private String continent;
    @JsonProperty("label")
    private String label;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Datum(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("number")
    public Object getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Object number) {
        this.number = number;
    }

    @JsonProperty("postal_code")
    public Object getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postal_code")
    public void setPostalCode(Object postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("street")
    public Object getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(Object street) {
        this.street = street;
    }

    @JsonProperty("confidence")
    public Integer getConfidence() {
        return confidence;
    }

    @JsonProperty("confidence")
    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("region_code")
    public String getRegionCode() {
        return regionCode;
    }

    @JsonProperty("region_code")
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    @JsonProperty("county")
    public String getCounty() {
        return county;
    }

    @JsonProperty("county")
    public void setCounty(String county) {
        this.county = county;
    }

    @JsonProperty("locality")
    public String getLocality() {
        return locality;
    }

    @JsonProperty("locality")
    public void setLocality(String locality) {
        this.locality = locality;
    }

    @JsonProperty("administrative_area")
    public String getAdministrativeArea() {
        return administrativeArea;
    }

    @JsonProperty("administrative_area")
    public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    @JsonProperty("neighbourhood")
    public Object getNeighbourhood() {
        return neighbourhood;
    }

    @JsonProperty("neighbourhood")
    public void setNeighbourhood(Object neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("continent")
    public String getContinent() {
        return continent;
    }

    @JsonProperty("continent")
    public void setContinent(String continent) {
        this.continent = continent;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
