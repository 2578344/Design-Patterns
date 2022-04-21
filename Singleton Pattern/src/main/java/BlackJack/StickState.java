package BlackJack;

import Player.Player;

public class StickState implements PlayerState {

    private static StickState uniqueInstance;

    private StickState(){

    };

    public static StickState getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new StickState();
        }
        return uniqueInstance;
    }
    public void setState(BlackJack game, Player player, BlackJackAction action){
        game.setPlayerState(EndState.getInstance(),  player, action);
    }

    public BlackJackAction getState(){
        return BlackJackAction.STICK;
    }
}
