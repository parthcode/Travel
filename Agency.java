
package rome2rio;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Agency {

    private String code;
    private String name;
    private String url;
    private String iconPath;
    private String iconSize;
    private String iconOffset;
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
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The iconPath
     */
    public String getIconPath() {
        return iconPath;
    }

    /**
     * 
     * @param iconPath
     *     The iconPath
     */
    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    /**
     * 
     * @return
     *     The iconSize
     */
    public String getIconSize() {
        return iconSize;
    }

    /**
     * 
     * @param iconSize
     *     The iconSize
     */
    public void setIconSize(String iconSize) {
        this.iconSize = iconSize;
    }

    /**
     * 
     * @return
     *     The iconOffset
     */
    public String getIconOffset() {
        return iconOffset;
    }

    /**
     * 
     * @param iconOffset
     *     The iconOffset
     */
    public void setIconOffset(String iconOffset) {
        this.iconOffset = iconOffset;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
