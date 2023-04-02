package by.teachmeskills.api;

import by.teachmeskills.api.client.ResourcesApiClient;
import by.teachmeskills.api.dto.resources.GetSingleResource;
import by.teachmeskills.api.dto.resources.ResourcesDatum;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class GetSingleResourceTest extends BaseTest {
    @Test
    public void getSingleResource() {
        ResourcesDatum fuchsiaRose = ResourcesDatum.builder()
                .id(2)
                .name("fuchsia rose")
                .year(2001)
                .color("#C74375")
                .pantone_value("17-2031")
                .build();
        GetSingleResource expectedResponse = GetSingleResource.builder()
                .data(fuchsiaRose)
                .support(support)
                .build();

        GetSingleResource actualResponse = new ResourcesApiClient().get(2);
        Assertions.assertThat(expectedResponse)
                .as("Request to get response should be equal to provided object")
                .isEqualTo(actualResponse);
    }
}
