package hungrytigers.eatstreet.services;

import hungrytigers.eatstreet.models.RestaurantSearchRequest;
import hungrytigers.eatstreet.models.RestaurantSearchResponse;

public interface RestaurantService {
    RestaurantSearchResponse search(RestaurantSearchRequest request);
}
