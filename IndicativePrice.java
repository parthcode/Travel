
package rome2rio;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class IndicativePrice {

    private long price;
    private String currency;
    private long isFreeTransfer;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The price
     */
    public long getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(long price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The isFreeTransfer
     */
    public long getIsFreeTransfer() {
        return isFreeTransfer;
    }

    /**
     * 
     * @param isFreeTransfer
     *     The isFreeTransfer
     */
    public void setIsFreeTransfer(long isFreeTransfer) {
        this.isFreeTransfer = isFreeTransfer;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
