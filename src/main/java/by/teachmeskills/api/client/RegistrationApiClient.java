package by.teachmeskills.api.client;

import by.teachmeskills.api.dto.registration.RegistrationAnswer;
import by.teachmeskills.api.dto.registration.RegistrationForm;
import io.restassured.response.Response;

public class RegistrationApiClient extends BaseApiClient {
    public static final String PATH_REGISTRATION = "/register";
    public static final String PATH_LOGIN = "/login";

    public RegistrationAnswer postSuccessful(String path, RegistrationForm body) {
        return post(path, body, RegistrationAnswer.class);
    }

    public Response postUnsuccessful(String path, RegistrationForm body) {
        return post(path, body);
    }
}
