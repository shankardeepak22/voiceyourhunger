package hungrytigers.eatstreet.services;

import hungrytigers.eatstreet.models.RestaurantDetailRequest;
import hungrytigers.eatstreet.models.RestaurantDetailResponse;
import hungrytigers.eatstreet.models.RestaurantSearchRequest;
import hungrytigers.eatstreet.models.RestaurantSearchResponse;

public interface RestaurantService {
    RestaurantSearchResponse search(final RestaurantSearchRequest request);

    RestaurantDetailResponse getRestaurantDetails(final String apiKey, RestaurantDetailRequest request);
}
