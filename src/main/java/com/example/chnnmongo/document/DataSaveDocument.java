package com.example.chnnmongo.document;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Getter
@Setter
public class DataSaveDocument {

    @Id
    private String id;

    private String name;

    private Integer accountNumber;

    private String city;

}
