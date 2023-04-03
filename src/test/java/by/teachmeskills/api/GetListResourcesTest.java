package by.teachmeskills.api;

import by.teachmeskills.api.client.ResourcesApiClient;
import by.teachmeskills.api.dto.resources.GetResourcesResponse;
import by.teachmeskills.api.dto.resources.ResourcesDatum;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class GetListResourcesTest extends BaseTest {
    @Test
    public void getListResources() {
        ResourcesDatum cerulean = ResourcesDatum.builder()
                .id(1)
                .name("cerulean")
                .year(2000)
                .color("#98B2D1")
                .pantone_value("15-4020")
                .build();
        ResourcesDatum fuchsiaRose = ResourcesDatum.builder()
                .id(2)
                .name("fuchsia rose")
                .year(2001)
                .color("#C74375")
                .pantone_value("17-2031")
                .build();
        ResourcesDatum trueRed = ResourcesDatum.builder()
                .id(3)
                .name("true red")
                .year(2002)
                .color("#BF1932")
                .pantone_value("19-1664")
                .build();
        ResourcesDatum aquaSky = ResourcesDatum.builder()
                .id(4)
                .name("aqua sky")
                .year(2003)
                .color("#7BC4C4")
                .pantone_value("14-4811")
                .build();
        ResourcesDatum tigerLily = ResourcesDatum.builder()
                .id(5)
                .name("tigerlily")
                .year(2004)
                .color("#E2583E")
                .pantone_value("17-1456")
                .build();
        ResourcesDatum blueTurquoise = ResourcesDatum.builder()
                .id(6)
                .name("blue turquoise")
                .year(2005)
                .color("#53B0AE")
                .pantone_value("15-5217")
                .build();
        ArrayList<ResourcesDatum> resources = new ArrayList<>();
        resources.add(cerulean);
        resources.add(fuchsiaRose);
        resources.add(trueRed);
        resources.add(aquaSky);
        resources.add(tigerLily);
        resources.add(blueTurquoise);
        GetResourcesResponse expectedResponse = GetResourcesResponse.builder()
                .page(1)
                .per_page(6)
                .total(12)
                .total_pages(2)
                .data(resources)
                .support(support)
                .build();
        GetResourcesResponse actualResponse = new ResourcesApiClient().get();
        Assertions.assertThat(expectedResponse)
                .as("Request to get response should be equal to provided object")
                .isEqualTo(actualResponse);
    }
}

