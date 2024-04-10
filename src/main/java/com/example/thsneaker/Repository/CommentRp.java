package com.example.thsneaker.Repository;

import com.example.thsneaker.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRp extends JpaRepository<Comment, Long> {
}
