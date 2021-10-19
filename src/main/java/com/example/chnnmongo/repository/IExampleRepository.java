package com.example.chnnmongo.repository;

import com.example.chnnmongo.document.DataSaveDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface IExampleRepository extends MongoRepository<DataSaveDocument,String> {


    DataSaveDocument findByCity(String city);

}
