package com.zengcode.repos;

import com.zengcode.model.AdvertModel;
import org.springframework.data.couchbase.repository.CouchbaseRepository;


public interface AdvertRepository extends CouchbaseRepository<AdvertModel, String> {

}
