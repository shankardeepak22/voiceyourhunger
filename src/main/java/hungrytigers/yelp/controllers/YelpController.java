package hungrytigers.yelp.controllers;

import hungrytigers.yelp.models.Businesses;
import hungrytigers.yelp.models.RestaurantRatingRequest;
import hungrytigers.yelp.models.RestaurantRatingResponse;
import hungrytigers.yelp.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "yelp")
public class YelpController {

    @Autowired
    private RatingService ratingService;

    @GetMapping(path = "ratings")
    public Businesses getRestaurantRating(final RestaurantRatingRequest request) {
        return ratingService.getRatingForRestaurant(request).getBusinesses()[0];
    }
}
