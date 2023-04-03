package by.teachmeskills.api;

import by.teachmeskills.api.client.UserJobApiClient;
import by.teachmeskills.api.dto.userwithjob.UserWithJob;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PatchUserTest {
    @Test
    public void updateUserTest() {
        UserWithJob user = UserWithJob.builder()
                .name("morpheus")
                .job("zion resident")
                .build();

        Response response = new UserJobApiClient().patch(user, 2);

        UserWithJob actualUser = response
                .then()
                .extract()
                .body()
                .as(UserWithJob.class);
        assertThat(actualUser)
                .as("Put user data should be saved correctly")
                .usingRecursiveComparison()
                .ignoringFields("createdAt", "updatedAt")
                .isEqualTo(user);

        assertThat(actualUser.updatedAt)
                .as("Updated time should be added for the user")
                .isNotNull();
    }

}
