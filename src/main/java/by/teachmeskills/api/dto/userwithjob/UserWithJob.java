package by.teachmeskills.api.dto.userwithjob;

import lombok.*;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class UserWithJob {
    public String name;
    public String job;
    public String id;
    public String createdAt;
    public String updatedAt;
}
