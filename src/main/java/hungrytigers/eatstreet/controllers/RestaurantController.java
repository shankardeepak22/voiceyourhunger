package hungrytigers.eatstreet.controllers;

import hungrytigers.eatstreet.models.RestaurantSearchRequest;
import hungrytigers.eatstreet.models.RestaurantSearchResponse;
import hungrytigers.eatstreet.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping(value = "search")
    public RestaurantSearchResponse search(@RequestBody final RestaurantSearchRequest request) {
        return restaurantService.search(request);
    }
}
