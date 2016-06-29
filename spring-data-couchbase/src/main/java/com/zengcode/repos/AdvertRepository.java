package com.zengcode.repos;

import com.zengcode.model.AdvertModel;
import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import java.util.List;


public interface AdvertRepository extends CouchbaseRepository<AdvertModel, String> {

    @Query("select * from advertisement where name = $0")
    List<AdvertModel> findByName(String name);
}
