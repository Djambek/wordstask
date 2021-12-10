package com.company;

public class Action {
    private String text;
    private Integer DestinationID;

    public Action(String text, int DestinationID) {
        this.text = text;
        this.DestinationID = DestinationID;
    }

    String getText(){
        return text;
    }
    Integer getDestinationID(){
        return DestinationID;
    }
}
