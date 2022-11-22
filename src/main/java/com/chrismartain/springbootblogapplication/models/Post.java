package com.chrismartain.springbootblogapplication.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id;

    private String title;
    @Column(columnDefinition = "TEXT")
    private String body;

    private LocalDate createdAt;
}
