package com.example.clevertec.data.repositories;

import com.example.clevertec.data.entities.Comment;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {
}
