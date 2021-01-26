package com.springboot.scheduler.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

}
