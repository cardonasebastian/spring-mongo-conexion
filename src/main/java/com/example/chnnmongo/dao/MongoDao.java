package com.example.chnnmongo.dao;

import com.example.chnnmongo.document.DataSaveDocument;
import com.example.chnnmongo.repository.IExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MongoDao {

    /**
     * Instance of ExampleRepository
     */
    @Autowired
    private IExampleRepository repository;

    /**
     * Method to save information at mongo.
     *
     * @param entity as mongo.
     */
    public void saveInformationMongo(DataSaveDocument entity){
        repository.save(entity);
    }
}
