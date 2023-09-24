package com.aleksandr.theancientterrorhelper.domain.Model.Detectiv;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.rmi.server.UID;
import java.util.UUID;

@Entity
@Data
@EqualsAndHashCode(of = "id")
@Accessors(chain = true)
public class Abilities {

    //knowledge. communication. attention. force. will
    @Id
    @GeneratedValue(generator = "uuid2")
    private UUID id;

    private Integer knowledge;

    private Integer communication;

    private Integer attention;

    private Integer force;

    private Integer will;


    @OneToOne(mappedBy = "abilities", cascade = CascadeType.ALL)
    private Detective detective;

}
