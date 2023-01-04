package calonius.solitaacademy.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "station")
public class Station {
    @Id
    private int FID;
    @Column(nullable = false)
    private int ID;
    @Column(nullable = false)
    private String nimi;
    @Column(nullable = false)
    private String namn;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String osoite;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String kaupunki;
    @Column(nullable = false)
    private String stad;
    @Column(nullable = false)
    private String operaattori;
    @Column(nullable = false)
    private String kapasiteetti;
    @Column(nullable = false)
    private float x;
    @Column(nullable = false)
    private float y;
}
