package com.example.todo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Todo implements Serializable {
    //Serialization: When we sent Java Object, it is turned into a file, so that it can be sent over the network
    //Deserialization: Turning that file again in to a Java Object

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String description;

    private ZonedDateTime startDate;

    private boolean done;

    private boolean favorite;

    @ManyToOne
    @JoinColumn(name="categoryId")
    @JsonIgnore
    private Category category;
}
