package com.nithin.bootifyecommerce2.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CommentDTO {

	private Long id;
	
	@NotNull
	private String text;
	private ProductDTO product;
	private UserDTO user;

}
