package by.teachmeskills.api;

import by.teachmeskills.api.client.UserJobApiClient;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeleteUserTest {
    @Test
    public void deleteUser() {
        Response response = new UserJobApiClient().delete(2);
        assertThat(response.getStatusCode())
                .as("Status code should be 204")
                .isEqualTo(204);
    }
}
