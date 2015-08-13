
package rome2rio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Route {

    private String name;
    private double distance;
    private long duration;
    private long totalTransferDuration;
    private IndicativePrice indicativePrice;
    private List<Stop> stops = new ArrayList<Stop>();
    private List<Segment> segments = new ArrayList<Segment>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
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
     *     The totalTransferDuration
     */
    public long getTotalTransferDuration() {
        return totalTransferDuration;
    }

    /**
     * 
     * @param totalTransferDuration
     *     The totalTransferDuration
     */
    public void setTotalTransferDuration(long totalTransferDuration) {
        this.totalTransferDuration = totalTransferDuration;
    }

    /**
     * 
     * @return
     *     The indicativePrice
     */
    public IndicativePrice getIndicativePrice() {
        return indicativePrice;
    }

    /**
     * 
     * @param indicativePrice
     *     The indicativePrice
     */
    public void setIndicativePrice(IndicativePrice indicativePrice) {
        this.indicativePrice = indicativePrice;
    }

    /**
     * 
     * @return
     *     The stops
     */
    public List<Stop> getStops() {
        return stops;
    }

    /**
     * 
     * @param stops
     *     The stops
     */
    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }

    /**
     * 
     * @return
     *     The segments
     */
    public List<Segment> getSegments() {
        return segments;
    }

    /**
     * 
     * @param segments
     *     The segments
     */
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
