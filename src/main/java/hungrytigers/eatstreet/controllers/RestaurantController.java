package hungrytigers.eatstreet.controllers;

import hungrytigers.eatstreet.models.*;
import hungrytigers.eatstreet.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping(path = "search")
    public List<FilteredRestaurant> search(@RequestBody final RestaurantSearchRequest request) {
        return restaurantService.search(request);
    }

    @PostMapping(path = "{apiKey}")
    public RestaurantDetailResponse getRestaurantDetails(@PathVariable("apiKey") final String apiKey, @RequestBody final RestaurantDetailRequest request) {
        return restaurantService.getRestaurantDetails(apiKey, request);
    }

    @GetMapping(path = "{apiKey}/menu")
    public MenuCategory[] getMenuFromRestaurant(@PathVariable("apiKey") final String apiKey) {
        return restaurantService.getMenuForRestaurant(apiKey);
    }
}
