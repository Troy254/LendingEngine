package com.peerlender.lendingengine.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity // is used to indicate that a Java class represents a database entity
@Data // Loads getters and setters
@AllArgsConstructor //It generates a constructor with arguments for all the fields of a class.
@NoArgsConstructor //Creates empty constructor
@Table(name = "USERS") // Create table name in db
public class User {
      @Id// indicates that this field "private Long id;" is the primary key
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      private String firstName;
      private String lastName;
      private Integer age;
      private String occupation;


}
