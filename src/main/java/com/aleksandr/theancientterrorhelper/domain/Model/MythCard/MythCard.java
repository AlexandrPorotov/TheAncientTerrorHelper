package com.aleksandr.theancientterrorhelper.domain.Model.MythCard;

import java.rmi.server.UID;
import java.util.List;

//need to do:
//add annotation for map object to db
//add repo for work of entity from db
//add migration for this table
//check and test
public class MythCard {

    private UID id;
    private MythCardType type;
    //effects
    private List<MythEffect> effects;
    private String description;
    private String title;
    private int quantityTokenAncient;


}
