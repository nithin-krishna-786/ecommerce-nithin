package com.nithin.bootifyecommerce2.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nithin.bootifyecommerce2.domain.Comment;
import com.nithin.bootifyecommerce2.domain.Product;
import com.nithin.bootifyecommerce2.domain.User;
import com.nithin.bootifyecommerce2.model.CommentDTO;
import com.nithin.bootifyecommerce2.repos.CommentRepository;
import com.nithin.bootifyecommerce2.repos.ProductRepository;
import com.nithin.bootifyecommerce2.repos.UserRepository;

@Service
public class CommentService implements ICommentService{
	
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	public CommentDTO createCommentForProduct(CommentDTO commentDTO) {
		Comment comment = modelMapper.map(commentDTO, Comment.class);
		
		Product product = productRepository.findById(commentDTO.getProduct().getId()).orElseThrow(() -> new RuntimeException("Product not found"));
		User user = userRepository.findById(commentDTO.getUser().getId()).orElseThrow(() -> new RuntimeException("User not found"));
		
		comment.setProduct(product);
		comment.setUser(user);
		
		comment = commentRepository.save(comment);
		commentDTO = modelMapper.map(comment, CommentDTO.class);
		
		return commentDTO;
	}

}
