package com.example.clevertec.data.repositories;

import com.example.clevertec.data.entities.News;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface NewsRepository extends PagingAndSortingRepository<News, Long> {
}
