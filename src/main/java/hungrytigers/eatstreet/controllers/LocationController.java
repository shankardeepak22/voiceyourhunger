package hungrytigers.eatstreet.controllers;

import hungrytigers.eatstreet.models.Location;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "location")
public class LocationController {
    public static String LAT;
    public static String LON;

    @PostMapping
    public void getLocation(@RequestBody final Location location) {
        setLocation(location.getLat(), location.getLon());
    }

    public static void setLocation(String lat, String lon) {
        LAT = lat;
        LON = lon;
    }
}
