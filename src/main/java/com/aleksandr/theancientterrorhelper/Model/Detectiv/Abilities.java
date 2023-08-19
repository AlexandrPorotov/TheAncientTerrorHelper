package com.aleksandr.theancientterrorhelper.Model.Detectiv;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "abilities")
public class Abilities {

    //knowledge. communication. attention. force. will
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer knowledge;

    private Integer communication;

    private Integer attention;

    private Integer force;

    private Integer will;


    @OneToOne(mappedBy = "abilities", cascade = CascadeType.ALL)
    private Detective detective;

}
