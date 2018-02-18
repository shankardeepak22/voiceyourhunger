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

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public CustomizationGroup[] getCustomizationGroups() {
        return customizationGroups;
    }

    public void setCustomizationGroups(CustomizationGroup[] customizationGroups) {
        this.customizationGroups = customizationGroups;
    }
}
