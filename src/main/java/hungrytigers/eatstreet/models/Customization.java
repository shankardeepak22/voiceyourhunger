package hungrytigers.eatstreet.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A customization for a menu item
 *
 * @author Deepak Shankar
 * @version 1.0.0
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customization {
    private String apiKey;
    private String name;
    private String type;
    private CustomizationChoice[] customizationChoices;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CustomizationChoice[] getCustomizationChoices() {
        return customizationChoices;
    }

    public void setCustomizationChoices(CustomizationChoice[] customizationChoices) {
        this.customizationChoices = customizationChoices;
    }
}
