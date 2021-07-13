package com.example.clevertec.data.repositories;

import com.example.clevertec.data.entities.News;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface NewsRepository extends CrudRepository<News, Long> {
    List<News> findAll(Pageable page);
}
