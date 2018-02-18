package hungrytigers.eatstreet.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A geographical area to which a restaurant delivers
 *
 * @author Deepak Shankar
 * @version 1.0.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeliveryZone {
    private String apiKey;
    private String description;
    private String[] zips;
    private LatLonPoint[] points;
    private LatLonPoint[] holePoints;
    private float maximumRadius;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getZips() {
        return zips;
    }

    public void setZips(String[] zips) {
        this.zips = zips;
    }

    public LatLonPoint[] getPoints() {
        return points;
    }

    public void setPoints(LatLonPoint[] points) {
        this.points = points;
    }

    public LatLonPoint[] getHolePoints() {
        return holePoints;
    }

    public void setHolePoints(LatLonPoint[] holePoints) {
        this.holePoints = holePoints;
    }

    public float getMaximumRadius() {
        return maximumRadius;
    }

    public void setMaximumRadius(float maximumRadius) {
        this.maximumRadius = maximumRadius;
    }
}
