package com.example.postgreexample;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = {"id"})
@ToString
@Table(name ="kisi_adres")
public class Adres implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_kisi_adres", allocationSize = 1)
    @GeneratedValue(generator =  "seq_kisi_adres",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length=500,name="adres")
    private String address;
    @Column(name="aktif")
    private Boolean aktif;

    @Enumerated
    private AdresTip adresTip;
    @ManyToOne
    @JoinColumn(name="kisi_adres_id")
    private Kisi kisi;


    public enum AdresTip{
         EV_ADRESI,
         IS_ADRES,
         DIGER
     }
}
