package com.nithin.bootifyecommerce2.repos;

import com.nithin.bootifyecommerce2.domain.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {


}
