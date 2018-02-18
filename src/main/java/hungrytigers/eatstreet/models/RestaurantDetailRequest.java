package hungrytigers.eatstreet.models;

import hungrytigers.eatstreet.controllers.LocationController;
import hungrytigers.eatstreet.util.URI;

public class RestaurantDetailRequest {

    private String apiKey;
    private String streetAddress;
    private String latitude = LocationController.LAT;
    private String longitude = LocationController.LON;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getUri() {
        StringBuilder builder = new StringBuilder(URI.BASE);
        builder.append(URI.RESTAURANT_DETAILS);
        builder.append(this.getApiKey());
        if (this != null) {
            builder.append("?");
            if (this.getStreetAddress() != null && this.getStreetAddress() != "") {
                builder.append("street-address");
            }
            if (this.getLatitude() != null && this.getLongitude() != null) {
                builder.append("&");
                builder.append("latitude=" + this.getLatitude());
                builder.append("&");
                builder.append("longitude=" + this.getLongitude());
            }
        }
        return builder.toString();
    }
}
