package com.flight_reservation_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "passangers")
public class Passanger extends AbstractEntity {

    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;

}
