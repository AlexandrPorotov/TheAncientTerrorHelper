package com.aleksandr.theancientterrorhelper.domain.Model.MythCard;

import java.io.File;
import java.rmi.server.UID;

public class MythEffect {

    //page 10 in rules of game (8 effects) need to add
    //Change omen, Reckoning effect, Open gate, Monster surge,
    //Place clues, Place rumor token, Place ancient token, (Play text effect)
    private UID id;
    private String name;
    private String description;
    private File icon;
    private int location; //if card have place rumor token
    private int quantityOfMonsters; //if card have number of monsters in monster surge effect
}
