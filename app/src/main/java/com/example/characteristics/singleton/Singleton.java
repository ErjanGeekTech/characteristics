package com.example.characteristics.singleton;

import com.example.characteristics.players.CharacterizationPlayers;

public class Singleton {
    private static Singleton INSTANCE = null;

    // other instance variables can be here

    private Singleton() {};

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return(INSTANCE);
    }
     public  String now(){
         CharacterizationPlayers players = new CharacterizationPlayers.CharacterizationPlayersBuilder()
                .build();
         return players.getHealth() + "\n" + players.getDamage() + "\n"+ players.getWeapon();
     }

}
