package by.teachmeskills.api;

import by.teachmeskills.api.client.ResourcesApiClient;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GetSingleResourceNotFoundTest {
    @Test
    public void getSingleResourceNegative() {
        Response response = new ResourcesApiClient().getResponse(23);
        assertThat(response.getStatusCode())
                .as("Status code should be 404")
                .isEqualTo(404);
    }
}
