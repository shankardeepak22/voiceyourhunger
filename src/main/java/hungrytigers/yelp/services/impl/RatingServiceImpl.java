package hungrytigers.yelp.services.impl;

import hungrytigers.yelp.models.Businesses;
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

@Service
public class RatingServiceImpl implements RatingService {

        @Autowired
        private RestTemplate restTemplate;

        @Override
        public Businesses getRatingForRestaurant(final RestaurantRatingRequest request) {
            ResponseEntity<RestaurantRatingResponse> response = restTemplate.exchange(request.getUri(), HttpMethod.GET, setHeader(), RestaurantRatingResponse.class);
            RestaurantRatingResponse restaurantRatingResponse = response.getBody();
            return restaurantRatingResponse.getBusinesses()[0];
        }

        private HttpEntity<String> setHeader() {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer iSIqAKV5-mYL0BuWhMGY37FxMH26XvPJjsE3BLL4IX-lsliPxrTjcEtJxpG8adlj1L7i2ho6qNONbjfcieOTn3GdsoFgEe1wjfpZYe8bOvhfHSZr7JfEnWqFIZ6HWnYx");
            HttpEntity<String> entity = new HttpEntity("parameters", headers);
            return entity;
        }
}
