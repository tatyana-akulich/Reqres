package by.teachmeskills.api;

import by.teachmeskills.api.client.RegistrationApiClient;
import by.teachmeskills.api.dto.registration.RegistrationAnswer;
import by.teachmeskills.api.dto.registration.RegistrationForm;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class LoginSuccessfulTest {
    @Test
    public void loginSuccessful() {
        RegistrationForm bodyForRegistration = RegistrationForm.builder()
                .email("eve.holt@reqres.in")
                .password("cityslicka")
                .build();

        RegistrationAnswer expectedAnswer = RegistrationAnswer.builder()
                .token("QpwL5tke4Pnpja7X4")
                .build();

        RegistrationAnswer answer = new RegistrationApiClient()
                .postSuccessful(RegistrationApiClient.PATH_LOGIN, bodyForRegistration);

        Assertions.assertThat(expectedAnswer)
                .as("Response should be equal to expected one")
                .isEqualTo(answer);
    }
}
