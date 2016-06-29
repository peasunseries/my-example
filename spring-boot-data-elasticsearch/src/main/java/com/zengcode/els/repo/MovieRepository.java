package com.zengcode.els.repo;

import com.zengcode.els.model.Movie;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface MovieRepository extends ElasticsearchRepository< Movie, String > {
    public List< Movie > findByName(String name);
    public List< Movie > findById(String id);
    public List<Movie> findByGenre(String name);
}