package hungrytigers.eatstreet.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A food item
 *
 * @author Deepak Shankar
 * @version 1.0.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {
    private String apiKey;
    private String name;
    private String description;
    private float basePrice;
    private CustomizationGroup[] customizationGroups;
}
