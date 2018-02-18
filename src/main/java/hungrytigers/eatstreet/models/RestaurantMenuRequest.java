package hungrytigers.eatstreet.models;

import hungrytigers.eatstreet.util.URI;

public class RestaurantMenuRequest {
    private String apiKey;
    private boolean includeCustomizations = false;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public boolean isIncludeCustomizations() {
        return includeCustomizations;
    }

    public void setIncludeCustomizations(boolean includeCustomizations) {
        this.includeCustomizations = includeCustomizations;
    }

    public String getUri() {
        StringBuilder builder = new StringBuilder(URI.BASE);
        builder.append(URI.RESTAURANT_MENU);
        builder.append("/" + apiKey + "/?" + includeCustomizations);
        return builder.toString();
    }
}
