
package rome2rio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class RomeRio {

    private long serveTime;
    private List<Place> places = new ArrayList<Place>();
    private List<Airport> airports = new ArrayList<Airport>();
    private List<Airline> airlines = new ArrayList<Airline>();
    private List<Aircraft> aircrafts = new ArrayList<Aircraft>();
    private List<Agency> agencies = new ArrayList<Agency>();
    private List<Route> routes = new ArrayList<Route>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The serveTime
     */
    public long getServeTime() {
        return serveTime;
    }

    /**
     * 
     * @param serveTime
     *     The serveTime
     */
    public void setServeTime(long serveTime) {
        this.serveTime = serveTime;
    }

    /**
     * 
     * @return
     *     The places
     */
    public List<Place> getPlaces() {
        return places;
    }

    /**
     * 
     * @param places
     *     The places
     */
    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    /**
     * 
     * @return
     *     The airports
     */
    public List<Airport> getAirports() {
        return airports;
    }

    /**
     * 
     * @param airports
     *     The airports
     */
    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

    /**
     * 
     * @return
     *     The airlines
     */
    public List<Airline> getAirlines() {
        return airlines;
    }

    /**
     * 
     * @param airlines
     *     The airlines
     */
    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    /**
     * 
     * @return
     *     The aircrafts
     */
    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    /**
     * 
     * @param aircrafts
     *     The aircrafts
     */
    public void setAircrafts(List<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }

    /**
     * 
     * @return
     *     The agencies
     */
    public List<Agency> getAgencies() {
        return agencies;
    }

    /**
     * 
     * @param agencies
     *     The agencies
     */
    public void setAgencies(List<Agency> agencies) {
        this.agencies = agencies;
    }

    /**
     * 
     * @return
     *     The routes
     */
    public List<Route> getRoutes() {
        return routes;
    }

    /**
     * 
     * @param routes
     *     The routes
     */
    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
