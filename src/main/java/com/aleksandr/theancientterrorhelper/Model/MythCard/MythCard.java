package com.aleksandr.theancientterrorhelper.Model.MythCard;

import java.rmi.server.UID;
import java.util.List;

public class MythCard {

    private UID id;
    private MythCardType type;
    //effects
    private List<MythEffect> effects;
    private String description;
    private String title;
    private int quantityTokenAncient;


}
