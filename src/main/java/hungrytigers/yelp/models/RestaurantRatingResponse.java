package hungrytigers.yelp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestaurantRatingResponse {

    private Businesses[] businesses;

    public Businesses[] getBusinesses() {
        return businesses;
    }

    public void setBusinesses(Businesses[] businesses) {
        this.businesses = businesses;
    }
}
