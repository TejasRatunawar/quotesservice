package com.tejas.myorg.quotesservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "quotes")
public class Quotes {

    private Long id;
    private int quoteid;
    private String author;
    private String quote;

}
