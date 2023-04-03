package by.teachmeskills.api;

import by.teachmeskills.api.client.UsersApiClient;
import by.teachmeskills.api.dto.users.Datum;
import by.teachmeskills.api.dto.users.GetSingleUser;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class GetSingleUserTest extends BaseTest {
    @Test
    public void getSingleUser() {
        Datum janetWeaver = Datum.builder()
                .id(2)
                .email("janet.weaver@reqres.in")
                .first_name("Janet")
                .last_name("Weaver")
                .avatar("https://reqres.in/img/faces/2-image.jpg")
                .build();

        GetSingleUser expectedResponse = GetSingleUser.builder()
                .data(janetWeaver)
                .support(support)
                .build();

        GetSingleUser actualResponse = new UsersApiClient().get(2);
        Assertions.assertThat(expectedResponse)
                .as("Request to get response should be equal to provided object")
                .isEqualTo(actualResponse);
    }
}
