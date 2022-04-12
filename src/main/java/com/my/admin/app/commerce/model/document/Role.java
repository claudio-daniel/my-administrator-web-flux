package com.my.admin.app.commerce.model.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "roles")
@Data
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private String name;

    private String description;
}