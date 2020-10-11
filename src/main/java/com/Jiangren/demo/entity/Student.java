package com.Jiangren.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Type(type="uuid-binary")
    private UUID id;

    @Column(name = "first_name", unique = false, nullable = false)
    private String firstName;

    @Column(name = "password", nullable = false)
    private String password;
}
