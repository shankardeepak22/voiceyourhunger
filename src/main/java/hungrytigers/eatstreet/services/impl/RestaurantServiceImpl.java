package hungrytigers.eatstreet.services.impl;

import hungrytigers.eatstreet.Exceptions.BadRequestException;
import hungrytigers.eatstreet.models.RestaurantDetailRequest;
import hungrytigers.eatstreet.models.RestaurantDetailResponse;
import hungrytigers.eatstreet.models.RestaurantSearchRequest;
import hungrytigers.eatstreet.models.RestaurantSearchResponse;
import hungrytigers.eatstreet.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public RestaurantSearchResponse search(final RestaurantSearchRequest request) {

        RestaurantSearchResponse response = restTemplate.exchange(request.getUrI(), HttpMethod.GET, setHeader(), RestaurantSearchResponse.class).getBody();
        return response;
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
