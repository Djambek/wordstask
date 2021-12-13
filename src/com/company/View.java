package com.company;

import java.util.Scanner;

public class View {
    static Scanner in = new Scanner(System.in);
    Game game;
    View(Game game){
        this.game = game;
    }
    void showLocation(Location loc){
        System.out.println(loc.getText());
        Action[] actions = loc.getActions();
        for (int i = 0; i < actions.length; ++i){
            System.out.println(i + 1 + ") "+ actions[i].getText());
        }
        int ans = in.nextInt();
        game.userChoice(ans-1);


    }
}
