package com.example.chnnmongo.service.impl;

import com.example.chnnmongo.dao.MongoDao;
import com.example.chnnmongo.document.DataSaveDocument;
import com.example.chnnmongo.mapper.ExampleMapper;
import com.example.chnnmongo.model.request.ModelExampleRequest;
import com.example.chnnmongo.service.IExampleService;
import com.example.chnnmongo.utils.LoggingUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ExampleServiceImpl implements IExampleService {

    /**
     * Instance of Mapper.
     */
    @Autowired
    private ExampleMapper mapper;

    /**
     * Instance of Dao.
     */
    @Autowired
    private MongoDao dao;

    @Override
    public void saveExampleInformation(ModelExampleRequest request) {
    log.info("Request from service {}", LoggingUtils.getJsonFormat(request,false));
    DataSaveDocument entity =  mapper.buildDataSave(request);
    dao.saveInformationMongo(entity);
    log.info("success transaction");
    }
}
