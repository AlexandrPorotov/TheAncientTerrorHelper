package com.aleksandr.theancientterrorhelper.Model;

import java.io.File;
import java.rmi.server.UID;

//The class which is descriptions of users detective card
public class Detective {

    //TO DO
    //add list of actives
    //? actions and ability classes ?
    //class of

    private UID id;
    private File avatar; //not used
    private String name;
    private String profession;
    private String action; //description of action
    private String ability;//description of ability
    private String phrase;
    private int fiscalHealth;
    private int mentalHealth;

    //another side of card
    private Location startedLocation;
    private String startedInventory; //description of stared actives

}
