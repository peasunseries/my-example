package com.zengcode.els.repo;

import com.zengcode.els.model.Movie;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.elasticsearch.index.query.QueryBuilders.*;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    public List<Movie> getByName(String name) {
        return repository.findByName(name);
    }

    public List<Movie> getById(String id) {
        return repository.findById(id);
    }

    public void addMovie(Movie movie) {
        repository.save(movie);
    }

    public  List<Movie> getByGenreName(String name) {
        QueryBuilder builder = nestedQuery("genre", QueryBuilders.matchQuery("genre.name", name)); //OK

        QueryBuilder builder2 = nestedQuery( //OK
                "genre",
                boolQuery()
                        .should(QueryBuilders.matchQuery("genre.name", "ACTION")) //can use must
                        .should(QueryBuilders.matchQuery("genre.name", "SCI_FI"))
                        .mustNot(QueryBuilders.matchQuery("genre.name", "ROMANCE"))

        );

        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                //.withQuery(matchQuery("name", name))
                .withQuery(builder2)
                .build();
        return elasticsearchTemplate.queryForList(searchQuery, Movie.class);
    }
}
