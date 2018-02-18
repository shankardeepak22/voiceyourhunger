package hungrytigers.eatstreet.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A latitude/longitude pair.
 *
 * @author Deepak Shankar
 * @version 1.0.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LatLonPoint {
    private long latitude;
    private long longitude;

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }
}
