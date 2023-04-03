package by.teachmeskills.api.dto.resources;

import by.teachmeskills.api.dto.users.Support;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class GetResourcesResponse {
    public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public List<ResourcesDatum> data;
    public Support support;
}
