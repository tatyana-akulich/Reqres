package by.teachmeskills.api.dto.users;

import lombok.*;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class GetSingleUser {
    public Datum data;
    public Support support;
}
