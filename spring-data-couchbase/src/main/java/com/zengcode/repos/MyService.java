package com.zengcode.repos;

import com.couchbase.client.java.query.N1qlQuery;
import com.couchbase.client.java.query.N1qlQueryResult;
import com.google.gson.Gson;
import com.zengcode.model.AdvertModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MyService {

    @Autowired
    private CouchbaseTemplate template;

     public N1qlQueryResult findByName() {
         N1qlQuery queryWithParameter = N1qlQuery.simple("select * from advertisement where name  = 'Advertisement 73' ");
         return template.queryN1QL(queryWithParameter);
         /*N1qlQuery queryWithParameter = N1qlQuery.parameterized("select * from advertisement where name  = $1 ", JsonArray.from("Advertisement 73'"));
         return template.queryN1QL(queryWithParameter);*/
    }





    public List<AdvertModel> findByName2(String name) {
        N1qlQuery queryWithParameter = N1qlQuery.simple("select * from advertisement where name  = '" + name + "' ");
        return template.queryN1QL(queryWithParameter)
                .allRows()
                .stream()
                .map(row -> new Gson().fromJson(row.toString(), AdvertModel.class))
                .collect(Collectors.toList());
    }






}
