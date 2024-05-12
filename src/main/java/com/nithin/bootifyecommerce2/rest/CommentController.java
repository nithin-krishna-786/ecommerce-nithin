package com.nithin.bootifyecommerce2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nithin.bootifyecommerce2.model.CommentDTO;
import com.nithin.bootifyecommerce2.service.CommentService;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@PostMapping
	public ResponseEntity<CommentDTO> createCommentForProduct(@RequestBody CommentDTO commentDTO)
	{
		commentDTO = commentService.createCommentForProduct(commentDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(commentDTO);
	}

}
