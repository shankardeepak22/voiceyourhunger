package hungrytigers.eatstreet.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A grouping of menu items
 *
 * @author Deepak Shankar
 * @version 1.0.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MenuCategory {
    private String apiKey;
    private String name;
    private String description;
    private Item[] items;

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

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}
