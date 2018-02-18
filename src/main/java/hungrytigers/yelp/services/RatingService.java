package hungrytigers.yelp.services;

import hungrytigers.yelp.models.RestaurantRatingRequest;
import hungrytigers.yelp.models.RestaurantRatingResponse;

public interface RatingService {
    public RestaurantRatingResponse getRatingForRestaurant(final RestaurantRatingRequest request);
}
