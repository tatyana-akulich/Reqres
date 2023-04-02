package by.teachmeskills.api;

import by.teachmeskills.api.client.UsersApiClient;
import by.teachmeskills.api.dto.users.Datum;
import by.teachmeskills.api.dto.users.GetUsersResponse;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class GetListUsersTest extends BaseTest {

    @Test
    public void getListUsers() {

        Datum michaelLawson = Datum.builder()
                .id(7)
                .email("michael.lawson@reqres.in")
                .first_name("Michael")
                .last_name("Lawson")
                .avatar("https://reqres.in/img/faces/7-image.jpg")
                .build();

        Datum lindsayFerguson = Datum.builder()
                .id(8)
                .email("lindsay.ferguson@reqres.in")
                .first_name("Lindsay")
                .last_name("Ferguson")
                .avatar("https://reqres.in/img/faces/8-image.jpg")
                .build();

        Datum tobiasFunke = Datum.builder()
                .id(9)
                .email("tobias.funke@reqres.in")
                .first_name("Tobias")
                .last_name("Funke")
                .avatar("https://reqres.in/img/faces/9-image.jpg")
                .build();

        Datum byronFields = Datum.builder()
                .id(10)
                .email("byron.fields@reqres.in")
                .first_name("Byron")
                .last_name("Fields")
                .avatar("https://reqres.in/img/faces/10-image.jpg")
                .build();

        Datum georgeEdwards = Datum.builder()
                .id(11)
                .email("george.edwards@reqres.in")
                .first_name("George")
                .last_name("Edwards")
                .avatar("https://reqres.in/img/faces/11-image.jpg")
                .build();

        Datum rachelHowell = Datum.builder()
                .id(12)
                .email("rachel.howell@reqres.in")
                .first_name("Rachel")
                .last_name("Howell")
                .avatar("https://reqres.in/img/faces/12-image.jpg")
                .build();

        ArrayList<Datum> persons = new ArrayList<>();
        persons.add(michaelLawson);
        persons.add(lindsayFerguson);
        persons.add(tobiasFunke);
        persons.add(byronFields);
        persons.add(georgeEdwards);
        persons.add(rachelHowell);

        GetUsersResponse expectedResponse = GetUsersResponse.builder()
                .page(2)
                .per_page(6)
                .total(12)
                .total_pages(2)
                .data(persons)
                .support(support)
                .build();

        GetUsersResponse actualResponse = new UsersApiClient().get();
        Assertions.assertThat(expectedResponse)
                .as("Request to get response should be equal to provided object")
                .isEqualTo(actualResponse);
    }
}
