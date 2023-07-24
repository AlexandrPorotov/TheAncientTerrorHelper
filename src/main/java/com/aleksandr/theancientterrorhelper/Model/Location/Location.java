package com.aleksandr.theancientterrorhelper.Model.Location;

import java.io.File;
import java.rmi.server.UID;

public class Location {

    private UID id;
    private int number;
    private String name;
    private File image; //location picture
    private File icon; //location icon (city, sea, wilderness)
    private LocationType type; //city, sea, wilderness
    //add type of contact

}
