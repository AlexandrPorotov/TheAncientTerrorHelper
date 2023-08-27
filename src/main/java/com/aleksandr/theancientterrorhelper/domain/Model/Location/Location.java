package com.aleksandr.theancientterrorhelper.domain.Model.Location;

import com.aleksandr.theancientterrorhelper.domain.Model.Detectiv.Detective;
import com.aleksandr.theancientterrorhelper.domain.Model.Items.Evidence;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.File;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@EqualsAndHashCode(of = "id")
@Accessors(chain = true)
public class Location {

    @Id
    @GeneratedValue(generator = "uuid2")
    private UUID id;

    private int number;

    private String name;

    private File image; //location picture

    private File icon; //location icon (city, sea, wilderness)

    @Enumerated(EnumType.STRING)
    private LocationType type; //city, sea, wilderness


    //We have two fields, need to add one of them (started or current or both)
    //@OneToMany(mappedBy = "startedLocation", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<Detective> detectives;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Evidence> evidences;

    //add type of contact

}
