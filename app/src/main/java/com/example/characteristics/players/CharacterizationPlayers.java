package com.example.characteristics.players;

public class CharacterizationPlayers {

   public  int health;
   private int damage;
   private String weapon;

    public  int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getWeapon() {
        return weapon;
    }
    private CharacterizationPlayers(CharacterizationPlayersBuilder builder){
        this.health = builder.health;
        this.damage = builder.damage;
        this.weapon = builder.weapon;
    }
    public static class CharacterizationPlayersBuilder{
        private int health = 250;
        private int damage = 50;
        private  String weapon = "sword";

        public CharacterizationPlayersBuilder  setHealth(int health){
            this.health = health;
            return this;
        }
        public CharacterizationPlayersBuilder  setDamage(int damage){
            this.damage = damage;
            return this;
        }
        public CharacterizationPlayersBuilder  setWeapon(String weapon){
            this.weapon = weapon;
            return this;
        }
        public CharacterizationPlayers build (){
            return new CharacterizationPlayers(this);
        }
    }
}

