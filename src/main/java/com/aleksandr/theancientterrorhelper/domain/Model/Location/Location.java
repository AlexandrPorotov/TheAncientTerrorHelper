package com.aleksandr.theancientterrorhelper.domain.Model.Location;

import com.aleksandr.theancientterrorhelper.domain.Model.Detectiv.Detective;
import com.aleksandr.theancientterrorhelper.domain.Model.Items.Evidence;
import com.aleksandr.theancientterrorhelper.domain.Model.Location.Path.Path;
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
    @GeneratedValue(generator = "uuid2", strategy = GenerationType.AUTO)
    private UUID id;

    private int number;

    private String name;

    //private File image; //location picture

    //private File icon; //location icon (city, sea, wilderness)

    @Enumerated(EnumType.STRING)
    private LocationType type; //city, sea, wilderness

    @Enumerated(EnumType.STRING)
    private RegionType regionType; //America, Europe, Asia and Australia

    @OneToMany(mappedBy = "location")
    private List<Detective> detectives;

    //Paths for this location incoming and coming

    @OneToMany(mappedBy = "startLocation")
    private List<Path> pathsFromThisLocation;

    @OneToMany(mappedBy = "endLocation")
    private List<Path> pathsToThisLocation;

    //@OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<Evidence> evidences;

}
