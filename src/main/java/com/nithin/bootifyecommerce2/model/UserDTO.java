package com.nithin.bootifyecommerce2.model;

import org.springframework.format.annotation.NumberFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UserDTO {

    private Long id;

    @NotNull
    @Size(max = 30)
    private String name;

    @NotNull
    @Size(max = 50)
    @Email
    private String email;

    @NotNull
    @Pattern(regexp = "^\\d{12}$")
    private String phonenumber;

}
