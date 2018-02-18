package hungrytigers.eatstreet.models;

public class RestaurantDetailResponse {
    private Address address;
    private Restaurant restaurant;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
