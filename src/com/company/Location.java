package com.company;

import java.util.ArrayList;

public class Location extends Action{ // Ilja you look like sus?
    private String text;
    private Integer ID;
    private ArrayList<Action> actions = new ArrayList<Action>();
    String getText(){
        return this.text;
    }
    void addAction(Action a){
        actions.add(a);
    }
    Integer getID(){
        return ID;
    }
    ArrayList<Action> getActions(){
        return actions;
    }
}
