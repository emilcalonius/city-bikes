package calonius.solitaacademy.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "journey")
public class Journey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private Date departure_time;
    @Column(nullable = false)
    private Date arrival_time;
    @Column(nullable = false)
    private int departure_station_id;
    @Column(nullable = false)
    private int target_station_id;
    @Column(nullable = false)
    private int duration;
    @Column(nullable = false)
    private String departure_station;
    @Column(nullable = false)
    private String target_station;
}
