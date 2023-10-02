package com.aleksandr.theancientterrorhelper.domain.Model.Detectiv;

import com.aleksandr.theancientterrorhelper.domain.Model.Items.Active;
import com.aleksandr.theancientterrorhelper.domain.Model.Items.Artifact;
import com.aleksandr.theancientterrorhelper.domain.Model.Items.Evidence;
import com.aleksandr.theancientterrorhelper.domain.Model.Location.Location;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.File;
import java.util.List;
import java.util.UUID;

//The class which is descriptions of users detective card
@Entity
@Data
@EqualsAndHashCode(of = "id")
@Accessors(chain = true)
public class Detective {

    @Id
    @GeneratedValue(generator = "uuid2")
    private UUID id;

    //private File avatar; //not used
    private String name;
    private String profession;
    private String action; //description of action
    private String ability;//description of ability
    private String phrase;
    private Integer fiscalHealth;
    private Integer mentalHealth;

    @OneToOne
    @JoinColumn(name = "abilities_id")
    private Abilities abilities;

    //another side of card

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    private String startedInventory; //description of stared actives

//    @OneToMany(mappedBy = "detective")
//    private List<Active> startedActives;
//
//    @OneToMany(mappedBy = "detective")
//    private List<Artifact> startedArtifacts;
//
//    @OneToMany(mappedBy = "detective")
//    private List<Evidence> startedEvidence;
//
//    @OneToMany(mappedBy = "detective")
//    private List<Active> currentActives;
//
//    @OneToMany(mappedBy = "detective")
//    private List<Artifact> currentArtifacts;
//
//    @OneToMany(mappedBy = "detective")
//    private List<Evidence> currentEvidence;

    private String biography;
    private String deathDescription;
    private String madOffDescription;

}
