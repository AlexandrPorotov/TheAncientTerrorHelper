package com.aleksandr.theancientterrorhelper.DTO;

import com.aleksandr.theancientterrorhelper.Model.Detectiv.Abilities;
import jakarta.persistence.*;

import java.io.File;

public class DetectiveDTO {

    private String name;

    private String profession;

    private String action; //description of action

    private String ability;//description of ability

    private String phrase;

    private Integer fiscalHealth;

    private Integer mentalHealth;

    private Abilities abilities;

}
