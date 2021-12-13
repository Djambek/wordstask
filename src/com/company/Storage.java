package com.company;

public class Storage {
    Location[] locs = new Location[5];

    public Storage(){
        locs[0] = new Location(1, "Santa's garden. This snowman looks sus.", new Action[]{new Action("Investigate ", 2), new Action("Let it be", 3)});
        locs[1] = new Location(3, "It's just a cute snowman after all, nothing to worry about.", new Action[]{new Action("Mission failed", 1)});
        locs[2] = new Location(2, "After some investigation, you found a secret camera inside the snowman!", new Action[]{new Action("Deactive", 4), new Action("Break it", 5)});
        locs[3] = new Location(4, "You don'' know password!", new Action[]{new Action("Bruteforce it!", 1), new Action("Let it be", 1)});
        locs[4] = new Location(5, "This metal seems unbreakable, the elves seem to have put a spell on it", new Action[]{new Action("Mission failed!", 1)});


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
