package by.teachmeskills.api;

import by.teachmeskills.api.client.UserJobApiClient;
import by.teachmeskills.api.dto.userwithjob.UserWithJob;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PostUserTest {
    @Test
    public void createUserTest() {
        UserWithJob user = UserWithJob.builder()
                .name("morpheus")
                .job("leader")
                .build();

        Response response = new UserJobApiClient().post(user);
        assertThat(response.getStatusCode())
                .as("Expected status code is 201")
                .isEqualTo(201);

        UserWithJob actualUser = response
                .then()
                .extract()
                .body()
                .as(UserWithJob.class);
        assertThat(actualUser)
                .as("Post user data should be saved correctly")
                .usingRecursiveComparison()
                .ignoringFields("id", "createdAt")
                .isEqualTo(user);

        assertThat(actualUser.getId())
                .as("Id should be added for the user")
                .isNotNull();
    }
}
