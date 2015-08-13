
package rome2rio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Segment {

    private String kind;
    private String subkind;
    private long isMajor;
    private long isImperial;
    private double distance;
    private long duration;
    private long transferDuration;
    private String sName;
    private String sPos;
    private String tName;
    private String tPos;
    private String vehicle;
    private String path;
    private IndicativePrice_ indicativePrice;
    private List<Itinerary> itineraries = new ArrayList<Itinerary>();

     /**
     * 
     * @return
     *     The itineraries
     */
    public List<Itinerary> getItineraries() {
        return itineraries;
    }

    /**
     * 
     * @param itineraries
     *     The itineraries
     */
    public void setItineraries(List<Itinerary> itineraries) {
        this.itineraries = itineraries;
    }
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * @return
     *     The subkind
     */
    public String getSubkind() {
        return subkind;
    }

    /**
     * 
     * @param subkind
     *     The subkind
     */
    public void setSubkind(String subkind) {
        this.subkind = subkind;
    }

    /**
     * 
     * @return
     *     The isMajor
     */
    public long getIsMajor() {
        return isMajor;
    }

    /**
     * 
     * @param isMajor
     *     The isMajor
     */
    public void setIsMajor(long isMajor) {
        this.isMajor = isMajor;
    }

    /**
     * 
     * @return
     *     The isImperial
     */
    public long getIsImperial() {
        return isImperial;
    }

    /**
     * 
     * @param isImperial
     *     The isImperial
     */
    public void setIsImperial(long isImperial) {
        this.isImperial = isImperial;
    }

    /**
     * 
     * @return
     *     The distance
     */
    public double getDistance() {
        return distance;
    }

    /**
     * 
     * @param distance
     *     The distance
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * 
     * @return
     *     The duration
     */
    public long getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The transferDuration
     */
    public long getTransferDuration() {
        return transferDuration;
    }

    /**
     * 
     * @param transferDuration
     *     The transferDuration
     */
    public void setTransferDuration(long transferDuration) {
        this.transferDuration = transferDuration;
    }

    /**
     * 
     * @return
     *     The sName
     */
    public String getSName() {
        return sName;
    }

    /**
     * 
     * @param sName
     *     The sName
     */
    public void setSName(String sName) {
        this.sName = sName;
    }

    /**
     * 
     * @return
     *     The sPos
     */
    public String getSPos() {
        return sPos;
    }

    /**
     * 
     * @param sPos
     *     The sPos
     */
    public void setSPos(String sPos) {
        this.sPos = sPos;
    }

    /**
     * 
     * @return
     *     The tName
     */
    public String getTName() {
        return tName;
    }

    /**
     * 
     * @param tName
     *     The tName
     */
    public void setTName(String tName) {
        this.tName = tName;
    }

    /**
     * 
     * @return
     *     The tPos
     */
    public String getTPos() {
        return tPos;
    }

    /**
     * 
     * @param tPos
     *     The tPos
     */
    public void setTPos(String tPos) {
        this.tPos = tPos;
    }

    /**
     * 
     * @return
     *     The vehicle
     */
    public String getVehicle() {
        return vehicle;
    }

    /**
     * 
     * @param vehicle
     *     The vehicle
     */
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * 
     * @return
     *     The path
     */
    public String getPath() {
        return path;
    }

    /**
     * 
     * @param path
     *     The path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 
     * @return
     *     The indicativePrice
     */
    public IndicativePrice_ getIndicativePrice() {
        return indicativePrice;
    }

    /**
     * 
     * @param indicativePrice
     *     The indicativePrice
     */
    public void setIndicativePrice(IndicativePrice_ indicativePrice) {
        this.indicativePrice = indicativePrice;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
