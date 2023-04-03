package by.teachmeskills.api.dto.resources;

import lombok.*;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class ResourcesDatum {
    public int id;
    public String name;
    public int year;
    public String color;
    public String pantone_value;
}
