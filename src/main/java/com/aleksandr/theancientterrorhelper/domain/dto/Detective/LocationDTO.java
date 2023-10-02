package com.aleksandr.theancientterrorhelper.domain.dto.Detective;

import com.aleksandr.theancientterrorhelper.domain.Model.Detectiv.Detective;
import com.aleksandr.theancientterrorhelper.domain.Model.Location.LocationType;
import com.aleksandr.theancientterrorhelper.domain.Model.Location.RegionType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.File;
import java.util.List;
import java.util.UUID;

@Data
@Accessors(chain = true)
public class LocationDTO {


    private UUID id;

    private int number;

    private String name;

    //private File image; //location picture

    //private File icon; //location icon (city, sea, wilderness)

    @Enumerated(EnumType.STRING)
    private LocationType type; //city, sea, wilderness

    @Enumerated(EnumType.STRING)
    private RegionType regionType; //America, Europe, Asia and Australia

    private List<Detective> detectives;

}


