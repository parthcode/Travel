
package rome2rio;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Lines {

    private String name;
    private String vehicle;
    private String agency;
    private long frequency;
    private long duration;
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
     *     The agency
     */
    public String getAgency() {
        return agency;
    }

    /**
     * 
     * @param agency
     *     The agency
     */
    public void setAgency(String agency) {
        this.agency = agency;
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
