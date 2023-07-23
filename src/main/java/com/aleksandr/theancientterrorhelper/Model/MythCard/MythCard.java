package com.aleksandr.theancientterrorhelper.Model.MythCard;

import com.aleksandr.theancientterrorhelper.Model.Spell.MythEffectsType;

import java.rmi.server.UID;
import java.util.List;

public class MythCard {

    private UID id;
    private MythCardType type;
    //effects
    private List<MythEffectsType> effects;
    private String description;
    private String title;


}
