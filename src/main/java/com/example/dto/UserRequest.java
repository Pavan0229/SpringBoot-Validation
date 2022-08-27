package com.example.dto;

import lombok.*;

import javax.validation.constraints.*;

@Setter
@Getter
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "UserName should not be null")
    private String name;
    @Email(message = "Invalid Email Address")
    private String email;
    @NotNull
    @Pattern(regexp = "^\\d{10}$",message = "Invalid Mobile Number entered")
    private String mobile;
    private String gender;
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    private String nationality;


}
