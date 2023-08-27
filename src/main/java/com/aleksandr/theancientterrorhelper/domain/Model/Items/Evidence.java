package com.aleksandr.theancientterrorhelper.domain.Model.Items;

import com.aleksandr.theancientterrorhelper.domain.Model.Detectiv.Detective;
import com.aleksandr.theancientterrorhelper.domain.Model.Location.Location;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.UUID;

@Entity
@Data
@EqualsAndHashCode(of = "id")
@Accessors(chain = true)
public class Evidence {

    @Id
    @GeneratedValue(generator = "uuid2")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    private boolean onFieldFlag;

    @ManyToOne
    @JoinColumn(name = "detective_id")
    private Detective detective;

}
