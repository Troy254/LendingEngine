package com.peerlender.lendingengine.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Data //Loads getters and setters
@AllArgsConstructor
@NoArgsConstructor //Creates empty constructor
@Table(name = "users") //Create table name in db
public class User {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      private String firstName;
      private String lastName;
      private Integer age;
      private String occupation;

}
