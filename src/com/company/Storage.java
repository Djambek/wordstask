package com.company;

public class Storage {
    //private ArrayList<Location> locations = new ArrayList<Location>();
    Location[] locs = new Location[3];
    locs[0] = Location(1, "This snowman looks like sus", new Action[]{new Action("skip ", 1), new Action("Investigate", 2)})
    Location getLocation(int id){
        for (Location l : locs){
            if (l.getID() == id){
                return l;
            }
        }
        return null;
    }

}
