package by.teachmeskills.api.client;

import by.teachmeskills.api.dto.users.GetSingleUser;
import by.teachmeskills.api.dto.users.GetUsersResponse;
import io.restassured.response.Response;

public class UsersApiClient extends BaseApiClient {
    private static final String PATH = "/users";
    private static final String PATH_PAGE2 = PATH + "?page=2";
    private static final String PATH_DELAYED = PATH + "?delay=3";

    public GetUsersResponse get() {
        return get(PATH_PAGE2, GetUsersResponse.class);
    }

    public GetSingleUser get(int id) {
        return get(PATH + '/' + id, GetSingleUser.class);
    }

    public Response getResponse(int id) {
        return get(PATH + '/' + id);
    }

    public GetUsersResponse getDelayedResponse() {
        return get(PATH_DELAYED, GetUsersResponse.class);
    }
}
