package hungrytigers.eatstreet.services.impl;

import hungrytigers.eatstreet.Exceptions.BadRequestException;
import hungrytigers.eatstreet.models.*;
import hungrytigers.eatstreet.services.RestaurantService;
import hungrytigers.yelp.models.RestaurantRatingRequest;
import hungrytigers.yelp.models.RestaurantRatingResponse;
import hungrytigers.yelp.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RatingService ratingService;

    @Override
    public List<FilteredRestaurant> search(final RestaurantSearchRequest request) {

        List<FilteredRestaurant> filteredRestaurants = new ArrayList<>();
        RestaurantSearchResponse response = restTemplate.exchange(request.getUrI(), HttpMethod.GET, setHeader(), RestaurantSearchResponse.class).getBody();
        for (Restaurant restaurant : response.getRestaurants()) {
            FilteredRestaurant filteredRestaurant = new FilteredRestaurant();
            filteredRestaurant.setApiKey(restaurant.getApiKey());
            filteredRestaurant.setName(restaurant.getName());
            RestaurantRatingRequest restaurantRatingRequest = new RestaurantRatingRequest();
            restaurantRatingRequest.setLatitude(restaurant.getLatitude());
            restaurantRatingRequest.setLongitude(restaurant.getLongitude());
            restaurantRatingRequest.setRestaurantName(restaurant.getName());
            RestaurantRatingResponse restaurantRatingResponse = ratingService.getRatingForRestaurant(restaurantRatingRequest);
            filteredRestaurant.setRating(restaurantRatingResponse.getRating());
            filteredRestaurants.add(filteredRestaurant);
        }
        return filteredRestaurants;
    }

    @Override
    public RestaurantDetailResponse getRestaurantDetails(final String apiKey, final RestaurantDetailRequest request) {

        if (apiKey.equals(request.getApiKey())) {
            System.out.println(request.getUri());
            ResponseEntity<RestaurantDetailResponse> responseEntity = restTemplate.exchange(request.getUri(), HttpMethod.GET, setHeader(), RestaurantDetailResponse.class);
            RestaurantDetailResponse response = responseEntity.getBody();
            return response;
        } else {
            throw new BadRequestException("API keys mismatch!");
        }

    }

    private HttpEntity<String> setHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Access-Token", "561444e8ee2c5f5c");
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        return entity;
    }
}
