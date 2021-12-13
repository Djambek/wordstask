package com.company;

import java.util.ArrayList;

public class Location{
    int ID;
    String text;
    Action[] actions;
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
