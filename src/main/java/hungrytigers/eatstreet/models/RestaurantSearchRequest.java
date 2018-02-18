package hungrytigers.eatstreet.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import hungrytigers.eatstreet.util.URI;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestaurantSearchRequest {

    private String streetAddress;
    private String latitude;
    private String longitude;
    private String method;
    private String pickupRadius;
    private String search;

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

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPickupRadius() {
        return pickupRadius;
    }

    public void setPickupRadius(String pickupRadius) {
        this.pickupRadius = pickupRadius;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getUrI() {
        StringBuilder builder = new StringBuilder(URI.BASE);
        builder.append(URI.RESTAURANT_SEARCH);
        if (this != null) {
            builder.append("?");
            if ((this.getStreetAddress() == null || this.getStreetAddress() == "") && (this.getLatitude() == null || this.getLongitude() == null)) {

            } else {
                if (this.getStreetAddress() != null && this.getStreetAddress() != "") {
                    builder.append("street-address=" + this.getStreetAddress());
                }
                if ((this.getLongitude() != null && this.getLongitude() != "") && (this.getLatitude() != null && this.getLatitude() != "")) {
                    builder.append("&");
                    builder.append("latitude=" + this.getLatitude());
                    builder.append("&");
                    builder.append("longitude=" + this.getLongitude());
                }
                if (this.getMethod() != null && this.getMethod() != "") {
                    builder.append("&");
                    builder.append("method=" + this.getMethod());
                }
                if (this.getPickupRadius() != null && this.getPickupRadius() != "") {
                    builder.append("&");
                    builder.append("pickup-radius=" + this.getPickupRadius());
                }
                if (this.getSearch() != null && this.getSearch() != "") {
                    builder.append("&");
                    builder.append("search=" + this.getSearch());
                }
            }

        }

        return builder.toString();
    }
}
