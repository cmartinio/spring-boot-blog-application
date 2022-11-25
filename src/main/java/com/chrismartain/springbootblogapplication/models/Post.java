package com.chrismartain.springbootblogapplication.models;


import lombok.Getter;
import lombok.Setter;



import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

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

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "account_ID", nullable = false, referencedColumnName = "id")
    private Account account;

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + "'" +
                ", body='" + body + "'" +
                ", createdAt='" + createdAt + "'" +
                ", updatedAt='" + updatedAt + "'" +
                "}";
    }
}
