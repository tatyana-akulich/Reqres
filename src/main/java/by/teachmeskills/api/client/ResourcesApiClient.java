package by.teachmeskills.api.client;

import by.teachmeskills.api.dto.resources.GetResourcesResponse;
import by.teachmeskills.api.dto.resources.GetSingleResource;
import io.restassured.response.Response;

public class ResourcesApiClient extends BaseApiClient {
    private static final String PATH = "unknown";

    public GetResourcesResponse get() {
        return get(PATH, GetResourcesResponse.class);
    }

    public GetSingleResource get(int id) {
        return get(PATH + '/' + id, GetSingleResource.class);
    }

    public Response getResponse(int id) {
        return get(PATH + '/' + id);
    }
}
