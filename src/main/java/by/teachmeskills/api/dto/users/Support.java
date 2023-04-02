package by.teachmeskills.api.dto.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor()
@NoArgsConstructor
public class Support {
    public String url;
    public String text;
}
