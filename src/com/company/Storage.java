package com.company;

public class Storage {
    //private ArrayList<Location> locations = new ArrayList<Location>();
    Location[] locs = new Location[3];
    //locs[0] = Location(1, "This snowman looks like sus", new Action[]{new Action("skip ", 1), new Action("Investigate", 2)})
    public Storage(){
        locs[0] = new Location(1,
                "Santa's garden. This snowman looks sus.",
                new Action[]{new Action("Investigate", 2), new Action("Let it be",3)});
        locs[1] = new Location(2,
                "After some investigation, you found a secret camera inside the snowman!",
                new Action[]{new Action("Deactive", 3), new Action("Break it", 4)});

    }
    Location getLocation(int id){
        for (Location l : locs){
            if (l.getID() == id){
                return l;
            }
        }
        return null;
    }

}
