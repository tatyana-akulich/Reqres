package by.teachmeskills.api;

import by.teachmeskills.api.client.UsersApiClient;
import by.teachmeskills.api.dto.users.Datum;
import by.teachmeskills.api.dto.users.GetUsersResponse;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class DelayedResponseTest extends BaseTest {
    @Test
    public void getDelayedResponse() {

        Datum georgeBluth = Datum.builder()
                .id(1)
                .email("george.bluth@reqres.in")
                .first_name("George")
                .last_name("Bluth")
                .avatar("https://reqres.in/img/faces/1-image.jpg")
                .build();

        Datum janetWeaver = Datum.builder()
                .id(2)
                .email("janet.weaver@reqres.in")
                .first_name("Janet")
                .last_name("Weaver")
                .avatar("https://reqres.in/img/faces/2-image.jpg")
                .build();

        Datum emmaWong = Datum.builder()
                .id(3)
                .email("emma.wong@reqres.in")
                .first_name("Emma")
                .last_name("Wong")
                .avatar("https://reqres.in/img/faces/3-image.jpg")
                .build();

        Datum eveHolt = Datum.builder()
                .id(4)
                .email("eve.holt@reqres.in")
                .first_name("Eve")
                .last_name("Holt")
                .avatar("https://reqres.in/img/faces/4-image.jpg")
                .build();

        Datum charlesMorris = Datum.builder()
                .id(5)
                .email("charles.morris@reqres.in")
                .first_name("Charles")
                .last_name("Morris")
                .avatar("https://reqres.in/img/faces/5-image.jpg")
                .build();

        Datum traceyRamos = Datum.builder()
                .id(6)
                .email("tracey.ramos@reqres.in")
                .first_name("Tracey")
                .last_name("Ramos")
                .avatar("https://reqres.in/img/faces/6-image.jpg")
                .build();

        ArrayList<Datum> persons = new ArrayList<>();
        persons.add(georgeBluth);
        persons.add(janetWeaver);
        persons.add(emmaWong);
        persons.add(eveHolt);
        persons.add(charlesMorris);
        persons.add(traceyRamos);

        GetUsersResponse expectedResponse = GetUsersResponse.builder()
                .page(1)
                .per_page(6)
                .total(12)
                .total_pages(2)
                .data(persons)
                .support(support)
                .build();

        GetUsersResponse actualResponse = new UsersApiClient().getDelayedResponse();
        Assertions.assertThat(expectedResponse)
                .as("Request to get response should be equal to provided object")
                .isEqualTo(actualResponse);
    }
}
