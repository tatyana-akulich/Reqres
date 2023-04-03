package by.teachmeskills.api.dto.resources;

import by.teachmeskills.api.dto.users.Support;
import lombok.*;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class GetSingleResource {
    public ResourcesDatum data;
    public Support support;
}
