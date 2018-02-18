package hungrytigers.eatstreet.controllers;

import hungrytigers.eatstreet.models.*;
import hungrytigers.eatstreet.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping(path = "search")
    public RestaurantSearchResponse search(@RequestBody final RestaurantSearchRequest request) {
        return restaurantService.search(request);
    }

    @PostMapping(path = "{apiKey}")
    public RestaurantDetailResponse getRestaurantDetails(@PathVariable("apiKey") final String apiKey, @RequestBody final RestaurantDetailRequest request) {
        return restaurantService.getRestaurantDetails(apiKey, request);
    }

    /*public MenuCategory[] getMenuFromRestaurant(){

    }*/
}
