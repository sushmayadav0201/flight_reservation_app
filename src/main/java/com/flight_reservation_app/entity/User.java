package com.flight_reservation_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")

public class User extends AbstractEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
