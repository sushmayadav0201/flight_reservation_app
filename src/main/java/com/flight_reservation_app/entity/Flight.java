package com.flight_reservation_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "flights")

public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flightNumber;
    private String operatingAirline;
    private String departureCity;
    private String arrivalCity;
    private Date dateOfDeparture;
    private Date dateOfArrival;
    private Timestamp estimatedDepartureTime;
    private Timestamp estimatedArrivalTime;


}
