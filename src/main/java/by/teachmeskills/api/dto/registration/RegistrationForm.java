package by.teachmeskills.api.dto.registration;

import lombok.*;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class RegistrationForm {
    public String email;
    public String password;
}
