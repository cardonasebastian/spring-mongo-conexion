package com.example.chnnmongo.controller;

import com.example.chnnmongo.model.request.ModelExampleRequest;
import com.example.chnnmongo.service.IExampleService;
import com.example.chnnmongo.utils.LoggingUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/api/")
@Slf4j
public class MongoController {

    @Autowired
    private IExampleService service;

    @PostMapping("save/data/mongo")
    public ResponseEntity<Void> saveDataMongo(@RequestBody ModelExampleRequest request){
        log.info("Request controller {}", LoggingUtils.getJsonFormat(request,false));
        service.saveExampleInformation(request);
        log.info("Success controller");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
