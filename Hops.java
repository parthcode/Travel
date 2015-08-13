
package rome2rio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Hops {

    private double distance;
    private long duration;
    private String sName;
    private String sPos;
    private String tName;
    private String tPos;
    private long frequency;
    private IndicativePrice_ indicativePrice;
    private List<Lines> lines = new ArrayList<Lines>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The frequency
     */
    public long getFrequency() {
        return frequency;
    }

    /**
     * 
     * @param frequency
     *     The frequency
     */
    public void setFrequency(long frequency) {
        this.frequency = frequency;
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

    /**
     * 
     * @return
     *     The lines
     */
    public List<Lines> getLines() {
        return lines;
    }

    /**
     * 
     * @param lines
     *     The lines
     */
    public void setLines(List<Lines> lines) {
        this.lines = lines;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
