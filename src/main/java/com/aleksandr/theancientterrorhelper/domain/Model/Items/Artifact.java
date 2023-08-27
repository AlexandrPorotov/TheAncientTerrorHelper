package com.aleksandr.theancientterrorhelper.domain.Model.Items;

import com.aleksandr.theancientterrorhelper.domain.Model.Detectiv.Detective;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.UUID;

@Entity
@Data
@EqualsAndHashCode(of = "id")
@Accessors(chain = true)
public class Artifact {

    //TO DO
    //add field for bonuses of active

    @Id
    @GeneratedValue(generator = "uuid2")
    private UUID id;

    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "detective_id")
    private Detective detective;

}
