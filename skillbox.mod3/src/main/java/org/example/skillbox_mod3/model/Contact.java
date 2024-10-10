package org.example.skillbox_mod3.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Contact {
    Long id;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
}
