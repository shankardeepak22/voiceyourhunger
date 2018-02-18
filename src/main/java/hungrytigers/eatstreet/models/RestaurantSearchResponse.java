package hungrytigers.eatstreet.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Result for restaurant search through Eatstreet API
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestaurantSearchResponse {
    private Address address;
    private Restaurant[] restaurants;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Restaurant[] getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Restaurant[] restaurants) {
        this.restaurants = restaurants;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
