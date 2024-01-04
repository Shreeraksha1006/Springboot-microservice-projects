package com.demo.springboot.UserDto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        description = "UserDto Model Information"
)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    @Schema(
            description = "UserDto first name"
    )
    @NotEmpty
    private String firstName;
    @Schema(
            description = "UserDto last name"
    )
    @NotEmpty
    private String lastName;
    @Schema(
            description = "UserDto email address"
    )
    @NotEmpty
    @Email
    private String email;
}
