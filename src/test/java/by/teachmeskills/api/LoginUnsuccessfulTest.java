package by.teachmeskills.api;

import by.teachmeskills.api.client.RegistrationApiClient;
import by.teachmeskills.api.dto.registration.RegistrationAnswer;
import by.teachmeskills.api.dto.registration.RegistrationForm;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginUnsuccessfulTest {
    @Test
    public void loginUnsuccessful() {
        RegistrationForm form = RegistrationForm.builder()
                .email("peter@klaven")
                .build();

        RegistrationAnswer answer = RegistrationAnswer.builder()
                .error("Missing password")
                .build();

        Response response = new RegistrationApiClient().postUnsuccessful(RegistrationApiClient.PATH_LOGIN, form);
        assertThat(response.getStatusCode())
                .as("Status code should be 400")
                .isEqualTo(400);
        assertThat(response.then().extract().body().as(RegistrationAnswer.class))
                .as("Error text should be equal to expected")
                .isEqualTo(answer);
    }
}
