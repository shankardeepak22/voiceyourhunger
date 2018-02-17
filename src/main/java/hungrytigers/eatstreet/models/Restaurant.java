package hungrytigers.eatstreet.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

/**
 * An EatStreet Restaurant
 *
 * @author Deepak Shankar
 * @version 1.0.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Restaurant {
    private String apiKey;
    private float deliveryMin;
    private float deliveryPrice;
    private String logoUrl;
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String[] foodTypes;
    private String phone;
    private long latitude;
    private long longitude;
    private float minFreeDelivery;
    private float taxRate;
    private boolean acceptsCash;
    private boolean acceptsCard;
    private boolean offersPickup;
    private boolean offersDelivery;
    private boolean isTestRestaurant;
    private int minWaitTime;
    private int maxWaitTime;
    private boolean open;
    private String url;
    private Map<String, String[]> hours;
    private String timezone;
    private DeliveryZone[] zones;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public float getDeliveryMin() {
        return deliveryMin;
    }

    public void setDeliveryMin(float deliveryMin) {
        this.deliveryMin = deliveryMin;
    }

    public float getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(float deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String[] getFoodTypes() {
        return foodTypes;
    }

    public void setFoodTypes(String[] foodTypes) {
        this.foodTypes = foodTypes;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public float getMinFreeDelivery() {
        return minFreeDelivery;
    }

    public void setMinFreeDelivery(float minFreeDelivery) {
        this.minFreeDelivery = minFreeDelivery;
    }

    public float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(float taxRate) {
        this.taxRate = taxRate;
    }

    public boolean isAcceptsCash() {
        return acceptsCash;
    }

    public void setAcceptsCash(boolean acceptsCash) {
        this.acceptsCash = acceptsCash;
    }

    public boolean isAcceptsCard() {
        return acceptsCard;
    }

    public void setAcceptsCard(boolean acceptsCard) {
        this.acceptsCard = acceptsCard;
    }

    public boolean isOffersPickup() {
        return offersPickup;
    }

    public void setOffersPickup(boolean offersPickup) {
        this.offersPickup = offersPickup;
    }

    public boolean isOffersDelivery() {
        return offersDelivery;
    }

    public void setOffersDelivery(boolean offersDelivery) {
        this.offersDelivery = offersDelivery;
    }

    public boolean isTestRestaurant() {
        return isTestRestaurant;
    }

    public void setTestRestaurant(boolean testRestaurant) {
        isTestRestaurant = testRestaurant;
    }

    public int getMinWaitTime() {
        return minWaitTime;
    }

    public void setMinWaitTime(int minWaitTime) {
        this.minWaitTime = minWaitTime;
    }

    public int getMaxWaitTime() {
        return maxWaitTime;
    }

    public void setMaxWaitTime(int maxWaitTime) {
        this.maxWaitTime = maxWaitTime;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, String[]> getHours() {
        return hours;
    }

    public void setHours(Map<String, String[]> hours) {
        this.hours = hours;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public DeliveryZone[] getZones() {
        return zones;
    }

    public void setZones(DeliveryZone[] zones) {
        this.zones = zones;
    }
}
