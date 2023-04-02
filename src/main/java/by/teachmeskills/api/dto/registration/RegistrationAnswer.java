package by.teachmeskills.api.dto.registration;

import lombok.*;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class RegistrationAnswer {
    public int id;
    public String token;
    public String error;
}
