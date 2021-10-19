package com.example.chnnmongo.mapper;

import com.example.chnnmongo.document.DataSaveDocument;
import com.example.chnnmongo.model.request.ModelExampleRequest;
import org.springframework.stereotype.Component;

@Component
public class ExampleMapper {

    /**
     * Method to build data save document.
     *
     * @param requets as model.
     * @return DataSaveDocument.
     */
    public DataSaveDocument buildDataSave(ModelExampleRequest requets){
        DataSaveDocument entity = new DataSaveDocument();
        entity.setCity(requets.getCity());
        entity.setName(requets.getName());
        entity.setAccountNumber(requets.getAccountNumber());
        return entity;
    }
}
