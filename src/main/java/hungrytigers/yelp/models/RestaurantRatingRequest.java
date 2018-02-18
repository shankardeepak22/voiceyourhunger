package hungrytigers.yelp.models;

import hungrytigers.yelp.util.URI;

public class RestaurantRatingRequest {

    private String restaurantName;
    private double longitude;
    private double latitude;

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getUri() {
        StringBuilder uriSb = new StringBuilder();

        uriSb.append(URI.BASE);
        uriSb.append(URI.RATINGS);
        uriSb.append("?term=").append(this.restaurantName);
        uriSb.append("&longitude=").append(this.longitude);
        uriSb.append("&latitude=").append(this.latitude);

        return uriSb.toString();
    }
}
