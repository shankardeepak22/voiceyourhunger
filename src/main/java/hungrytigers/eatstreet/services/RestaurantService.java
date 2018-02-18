package hungrytigers.eatstreet.services;

import hungrytigers.eatstreet.models.*;

import java.util.List;

public interface RestaurantService {
    List<FilteredRestaurant> search(final RestaurantSearchRequest request);

    RestaurantDetailResponse getRestaurantDetails(final String apiKey, RestaurantDetailRequest request);
}
