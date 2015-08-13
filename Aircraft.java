
package rome2rio;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Aircraft {

    private String code;
    private String manufacturer;
    private String model;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * 
     * @param manufacturer
     *     The manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * 
     * @return
     *     The model
     */
    public String getModel() {
        return model;
    }

    /**
     * 
     * @param model
     *     The model
     */
    public void setModel(String model) {
        this.model = model;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
