package com.spring.mongo.demo.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Address {
    @Id
    private String _id = String.valueOf(new ObjectId());

    private String type;

    private String street;

    private String city;

    private String state;

    private String country;
}
