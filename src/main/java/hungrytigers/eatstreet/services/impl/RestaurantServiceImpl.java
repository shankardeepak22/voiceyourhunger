package hungrytigers.eatstreet.services.impl;

import hungrytigers.eatstreet.Util.URI;
import hungrytigers.eatstreet.models.RestaurantSearchRequest;
import hungrytigers.eatstreet.models.RestaurantSearchResponse;
import hungrytigers.eatstreet.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public RestaurantSearchResponse search(RestaurantSearchRequest request) {

        RestaurantSearchResponse response = restTemplate.getForObject(getRestUri(request), RestaurantSearchResponse.class);
        return response;
    }

    private String getRestUri(RestaurantSearchRequest request) {
        StringBuilder builder = new StringBuilder(URI.BASE);
        builder.append(URI.RESTAURANT_SEARCH);
        if (request != null) {
            builder.append("?");
            if ((request.getStreetAddress() == null || request.getStreetAddress() == "") && (request.getLatitude() == null || request.getLongitude() == null)) {

            } else {
                if (request.getStreetAddress() != null && request.getStreetAddress() != "") {
                    builder.append("street-address=" + request.getStreetAddress());
                }
                if ((request.getLongitude() != null && request.getLongitude() != "") && (request.getLatitude() != null && request.getLatitude() != "")) {
                    builder.append("&");
                    builder.append("latitude=" + request.getLatitude());
                    builder.append("&");
                    builder.append("longitude=" + request.getLongitude());
                }
                if (request.getMethod() != null && request.getMethod() != "") {
                    builder.append("&");
                    builder.append("method=" + request.getMethod());
                }
                if (request.getPickupRadius() != null && request.getPickupRadius() != "") {
                    builder.append("&");
                    builder.append("pickup-radius=" + request.getPickupRadius());
                }
                if (request.getSearch() != null && request.getSearch() != "") {
                    builder.append("&");
                    builder.append("search=" + request.getSearch());
                }
            }

        }

        return builder.toString();
    }
}
