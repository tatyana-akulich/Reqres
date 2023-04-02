package by.teachmeskills.api;

import by.teachmeskills.api.client.RegistrationApiClient;
import by.teachmeskills.api.dto.registration.RegistrationAnswer;
import by.teachmeskills.api.dto.registration.RegistrationForm;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RegisterUnsuccessfulTest {
    @Test
    public void registerUnsuccessful() {
        RegistrationForm form = RegistrationForm.builder()
                .email("sydney@fife")
                .build();

        RegistrationAnswer answer = RegistrationAnswer.builder()
                .error("Missing password")
                .build();
        Response response = new RegistrationApiClient().postUnsuccessful(RegistrationApiClient.PATH_REGISTRATION, form);
        assertThat(response.getStatusCode())
                .as("Status code should be 400")
                .isEqualTo(400);
        assertThat(response.then().extract().body().as(RegistrationAnswer.class))
                .as("Error text should be equal to expected")
                .isEqualTo(answer);
    }
}
