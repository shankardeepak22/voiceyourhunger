package hungrytigers.yelp.services;

import hungrytigers.yelp.models.Businesses;
import hungrytigers.yelp.models.RestaurantRatingRequest;
import hungrytigers.yelp.models.RestaurantRatingResponse;

public interface RatingService {
    public Businesses getRatingForRestaurant(final RestaurantRatingRequest request);
}
