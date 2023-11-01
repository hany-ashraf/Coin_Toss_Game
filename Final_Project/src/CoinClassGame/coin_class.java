package CoinClassGame;

import java.util.Random;

public class coin_class {
    //Global Members
    private String side;
    //constant variables
    public static String HEADS = "Heads";
    public static String TAILS = "Tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String flip(){

        if(new Random().nextBoolean()){
            setSide(HEADS);
        }
        else {
            setSide(TAILS);
        }

        return getSide();

    }

 }
