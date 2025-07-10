package service;

import java.util.ArrayList;

public class GameLogic {

    private ArrayList<Player> players;
    private Deck deck;

    public GameLogic(ArrayList<Player> players, Deck deck) {
        this.players = players;
        this.deck = deck;
    }

    public void startGame() {
        // game has started
        int thisTurnPlayer = 0;
        Player thisPlayer, declareVictory;
        Card cardDiscarded = null;

        while(true){
            // turns
            thisPlayer = players.get(thisTurnPlayer);

            // if discarded card is not null then ask the player
            // 1. want that card
            if( thisPlayer.askWantDiscardedCard(cardDiscarded) ){
                cardDiscarded = thisPlayer.whichCardDiscarded(cardDiscarded);
                continue;
            }

            // 2. discard their similar card
            if( thisPlayer.haveSameCard(cardDiscarded) ){
                continue;
            }

            Card topCard = deck.topCard();

            if(thisPlayer.wantToDeclareWin()){
                break;
            }

            switch (topCard.getSuit()){
                case "J":
                    Player playerToShuffle = thisPlayer.shuffleOthersDeck();
                    playerToShuffle.shuffleDeck();
                case "Q":
                    thisPlayer.ExchangeWithOtherPlayer();
                case "K":
                    thisPlayer.seeOneCard();
                default :
                    cardDiscarded = thisPlayer.askPlayer(cardDiscarded, topCard);
            }

        }

        Player winner = findWinner(thisPlayer);

        // print winner
        printWinnerPlayer(winner);

    }

    private Player findWinner(Player thisPlayer){

        int winnerScore = -1;
        Player winnerPlayer = null;

        for (Player player: players){
            int playerScore = player.score();
            if(winnerScore==-1){
                winnerScore = playerScore;
                winnerPlayer = player;
                continue;
            }

            if(playerScore>winnerScore) continue;

            if (playerScore == winnerScore){
                if(winnerPlayer == thisPlayer) winnerPlayer = player;
                continue;
            }

            winnerPlayer = player;
            winnerScore = playerScore;

        }

        return winnerPlayer;
    }

    private void printWinnerPlayer(Player winner) {

    }





}
