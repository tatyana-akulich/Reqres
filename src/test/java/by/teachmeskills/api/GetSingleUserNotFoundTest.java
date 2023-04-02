package by.teachmeskills.api;

import by.teachmeskills.api.client.UsersApiClient;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GetSingleUserNotFoundTest {
    @Test
    public void getSingleUserNegative() {
        Response response = new UsersApiClient().getResponse(23);
        assertThat(response.getStatusCode())
                .as("Status code should be 404")
                .isEqualTo(404);
    }
}
