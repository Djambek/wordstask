package com.company;

public class Game implements UserChoiceListener{
    Storage storage;
    View view;
    Location currentLocation;
    public Game(Storage storage){
        this.storage = storage;
        this.view = new View(this);
    }
    void start(){
        int idLoc = 1;

        currentLocation = storage.getLocation(idLoc);
        //view.showLocation(currentLocation);
        view.showLocation(currentLocation);
        //idLoc = currentLocation.getActions()[ans].getDestinationID();
        //currentLocation = storage.getLocation(idLoc);
        //start(idLoc);
       // финальная сцена будет -1


    }
    public void userChoice(int actionIndex){
        int idLoc = currentLocation.getActions()[actionIndex].getDestinationID();
        if (idLoc != -1){
            currentLocation = storage.getLocation(idLoc);
            view.showLocation(currentLocation);
        }
    }
}

interface UserChoiceListener{
    void userChoice(int actionIndex);
}