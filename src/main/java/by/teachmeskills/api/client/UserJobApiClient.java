package by.teachmeskills.api.client;

import by.teachmeskills.api.dto.userwithjob.UserWithJob;
import io.restassured.response.Response;

public class UserJobApiClient extends BaseApiClient {
    private static final String PATH = "/users";

    public Response post(UserWithJob body) {
        return post(PATH, body);
    }

    public Response put(UserWithJob body, int id) {
        return put(PATH + "/" + id, body);
    }

    public Response patch(UserWithJob body, int id) {
        return patch(PATH + "/" + id, body);
    }

    public Response delete(int id) {
        return delete(PATH + "/" + id);
    }
}
