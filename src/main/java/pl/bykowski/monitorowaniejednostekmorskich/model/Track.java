
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
    "timeStamp",
    "sog",
    "rot",
    "navstat",
    "mmsi",
    "cog",
    "geometry",
    "shipType",
    "name",
    "imo",
    "callsign",
    "country",
    "eta",
    "destination",
    "isSurvey",
    "heading",
    "draught",
    "a",
    "b",
    "c",
    "d"
})
@Generated("jsonschema2pojo")
public class Track {

    @JsonProperty("timeStamp")
    private String timeStamp;
    @JsonProperty("sog")
    private Double sog;
    @JsonProperty("rot")
    private Object rot;
    @JsonProperty("navstat")
    private Integer navstat;
    @JsonProperty("mmsi")
    private Integer mmsi;
    @JsonProperty("cog")
    private Double cog;
    @JsonProperty("geometry")
    private Geometry geometry;
    @JsonProperty("shipType")
    private Integer shipType;
    @JsonProperty("name")
    private String name;
    @JsonProperty("imo")
    private Object imo;
    @JsonProperty("callsign")
    private String callsign;
    @JsonProperty("country")
    private String country;
    @JsonProperty("eta")
    private Object eta;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("isSurvey")
    private Boolean isSurvey;
    @JsonProperty("heading")
    private Object heading;
    @JsonProperty("draught")
    private Double draught;
    @JsonProperty("a")
    private Integer a;
    @JsonProperty("b")
    private Integer b;
    @JsonProperty("c")
    private Integer c;
    @JsonProperty("d")
    private Integer d;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("timeStamp")
    public String getTimeStamp() {
        return timeStamp;
    }

    @JsonProperty("timeStamp")
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @JsonProperty("sog")
    public Double getSog() {
        return sog;
    }

    @JsonProperty("sog")
    public void setSog(Double sog) {
        this.sog = sog;
    }

    @JsonProperty("rot")
    public Object getRot() {
        return rot;
    }

    @JsonProperty("rot")
    public void setRot(Object rot) {
        this.rot = rot;
    }

    @JsonProperty("navstat")
    public Integer getNavstat() {
        return navstat;
    }

    @JsonProperty("navstat")
    public void setNavstat(Integer navstat) {
        this.navstat = navstat;
    }

    @JsonProperty("mmsi")
    public Integer getMmsi() {
        return mmsi;
    }

    @JsonProperty("mmsi")
    public void setMmsi(Integer mmsi) {
        this.mmsi = mmsi;
    }

    @JsonProperty("cog")
    public Double getCog() {
        return cog;
    }

    @JsonProperty("cog")
    public void setCog(Double cog) {
        this.cog = cog;
    }

    @JsonProperty("geometry")
    public Geometry getGeometry() {
        return geometry;
    }

    @JsonProperty("geometry")
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    @JsonProperty("shipType")
    public Integer getShipType() {
        return shipType;
    }

    @JsonProperty("shipType")
    public void setShipType(Integer shipType) {
        this.shipType = shipType;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("imo")
    public Object getImo() {
        return imo;
    }

    @JsonProperty("imo")
    public void setImo(Object imo) {
        this.imo = imo;
    }

    @JsonProperty("callsign")
    public String getCallsign() {
        return callsign;
    }

    @JsonProperty("callsign")
    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("eta")
    public Object getEta() {
        return eta;
    }

    @JsonProperty("eta")
    public void setEta(Object eta) {
        this.eta = eta;
    }

    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("isSurvey")
    public Boolean getIsSurvey() {
        return isSurvey;
    }

    @JsonProperty("isSurvey")
    public void setIsSurvey(Boolean isSurvey) {
        this.isSurvey = isSurvey;
    }

    @JsonProperty("heading")
    public Object getHeading() {
        return heading;
    }

    @JsonProperty("heading")
    public void setHeading(Object heading) {
        this.heading = heading;
    }

    @JsonProperty("draught")
    public Double getDraught() {
        return draught;
    }

    @JsonProperty("draught")
    public void setDraught(Double draught) {
        this.draught = draught;
    }

    @JsonProperty("a")
    public Integer getA() {
        return a;
    }

    @JsonProperty("a")
    public void setA(Integer a) {
        this.a = a;
    }

    @JsonProperty("b")
    public Integer getB() {
        return b;
    }

    @JsonProperty("b")
    public void setB(Integer b) {
        this.b = b;
    }

    @JsonProperty("c")
    public Integer getC() {
        return c;
    }

    @JsonProperty("c")
    public void setC(Integer c) {
        this.c = c;
    }

    @JsonProperty("d")
    public Integer getD() {
        return d;
    }

    @JsonProperty("d")
    public void setD(Integer d) {
        this.d = d;
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
