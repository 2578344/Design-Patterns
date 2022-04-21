package BlackJack;

import Player.Player;

public class StickState implements PlayerState {

    public void setState(BlackJack game, Player player, BlackJackAction action){
        game.setPlayerState(new EndState(),  player, action);
    }

    public BlackJackAction getState(){
        return BlackJackAction.STICK;
    }
}
