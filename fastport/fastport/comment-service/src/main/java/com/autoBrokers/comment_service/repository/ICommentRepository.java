package com.autoBrokers.comment_service.repository;

import com.autoBrokers.comment_service.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICommentRepository extends JpaRepository<Comment, Long> {


    List<Comment> findByIdDriver(Long idDriver);

    List<Comment> findByIdClient(Long idClient);
}
