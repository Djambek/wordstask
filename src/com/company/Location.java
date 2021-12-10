package com.company;

import java.util.ArrayList;

public class Location{ // Ilja you look like sus?
    int ID;
    String text;
    Action[] actions = new Action[];
    public Location(int ID, String text, Action[] actions){
        this.ID = ID;
        this.text = text;
        this.actions = actions;
    }
    //private ArrayList<Action> actions = new ArrayList<Action>();
    String getText(){
        return this.text;
    }
    Integer getID(){
        return ID;
    }
    Action[] getActions(){
        return actions;
    }
}
