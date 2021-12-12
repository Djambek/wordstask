package com.company;

public class Storage<loc> {
    //private ArrayList<Location> locations = new ArrayList<Location>();
    Location[] locs = new Location[3];
    locs[0] = Location(1, "Santa's garden. This snowman looks sus.", new Action[]{new Action("Investigate ", 2), new Action("Let it be", 3)});
    locs[1] = Location(3, "It's just a cute snowman after all, nothing to worry about.", new Action[]{new Action("Mission failed", 1)});
    locs[2] = Location(2, "After some investigation, you found a secret camera inside the snowman!", new Action[]}{new Action("Deactive", 4), new Action("Break it", 5)});
    locs[3] = Location(4, "You don'' know password!", new Action[]{new Action("Bruteforce it!", 1), new Action("Let it be", 1)});
    locs[4] = Location(5, "This metal seems unbreakable, the elves seem to have put a spell on it", new Action[]{new Action("Mission failed!"), 1})

    Location getLocation(int id){
        for (Location l : loc){
            if (l.getID() == id){
                return l;
            }
        }
        return null;
    }

}
