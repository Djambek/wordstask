package com.company;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Location> locations = new ArrayList<Location>();
    Location getLocation(int id){
        for (Location l : locations){
            if (l.getID() == id){
                return l;
            }
        }
        return null;
    }

}
