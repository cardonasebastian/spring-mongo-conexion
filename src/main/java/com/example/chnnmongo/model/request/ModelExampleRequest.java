package com.example.chnnmongo.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModelExampleRequest {

    /**
     * Name of account.
     */
    private String name;
    /**
     * Account Number
     */
    private Integer accountNumber;
    /**
     * City.
     */
    private String city;
}
