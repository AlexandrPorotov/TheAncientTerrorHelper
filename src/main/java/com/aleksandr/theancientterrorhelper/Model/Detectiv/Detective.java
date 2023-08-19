package com.aleksandr.theancientterrorhelper.Model.Detectiv;

import jakarta.persistence.*;
import lombok.Data;

import java.io.File;
//The class which is descriptions of users detective card
@Data
@Entity
@Table(name = "detectives")
public class Detective {

    //TO DO
    //add list of actives
    //? actions and ability classes ?
    //class of


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private File avatar; //not used

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

    //need to add list of things (tickets/weapon)

    //another side of card
    /*
    private Location startedLocation;
    private Location currentLocation;
    private String startedInventory; //description of stared actives

    private List<Active> startedActives;
    private List<Artifact> startedArtifacts;
    private List<Evidence> startedEvidence;
    private List<Active> currentActives;
    private List<Artifact> currentArtifacts;
    private List<Evidence> currentEvidence;
    private String biography;
    private String deathDescription;
    private String madOffDescription;
    */

}
