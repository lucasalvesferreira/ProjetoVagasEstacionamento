package com.api.PROJETO_CRUD_BANCO.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_PARKING_SPOT")

public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false,unique = true,length = 10)
    private String parkingSpotNumber;
    @Column(nullable = false,unique = true,length = 7)
    private String licensePlateCar;











}
