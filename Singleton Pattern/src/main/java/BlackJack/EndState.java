package BlackJack;

import Player.Player;

public class EndState implements PlayerState {
    private static EndState uniqueInstance;

    private EndState(){};
    public static EndState getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new EndState();
        }
        return uniqueInstance;
    }
    public void setState(BlackJack game, Player player, BlackJackAction action){
        game.determineWinner(game.players);
        if (action != BlackJackAction.END){
            game.showPlayers();
            game.resetPlayers();
            game.dealCards();
            game.setPlayerState(ReadyToPlayState.getInstance(), player, action);
        }
    }

    public BlackJackAction getState(){
        return BlackJackAction.END;
    }
}
