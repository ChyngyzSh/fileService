package kg.megacom.fileservice.models;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class User {
    Long id;
    String name;
    String urlPicture;
    String email;
    boolean active;
}
