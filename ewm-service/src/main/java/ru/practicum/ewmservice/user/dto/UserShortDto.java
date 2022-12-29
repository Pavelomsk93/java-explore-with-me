package ru.practicum.ewmservice.user.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserShortDto {
    Long id;

    String name;
}
