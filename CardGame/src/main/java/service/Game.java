package service;

import java.util.ArrayList;

public class Game {

    // players array list
    private ArrayList<Player> players = new ArrayList<>();
    private Deck deck;
    private GameLogic gamelogic;


    public Game(ArrayList<Player> players){

        deck  = new Deck();
        deck.shuffle();

        this.players = players;

        distribute();

        gameStart();







    }

    private void distribute(){
        for(int i = 0; i < 4; i++){
            System.out.println("hell");
            System.out.println("hell");
            System.out.println("hell");
            System.out.println("hell");
            System.out.println("hell");
        }
    }

    private void gameStart(){

        this.gamelogic = new GameLogic(players, deck);
        this.gamelogic.startGame();


    }


}
