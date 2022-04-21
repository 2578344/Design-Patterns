package BlackJack;

import Player.Player;

public class TwistState implements PlayerState {

    private static TwistState uniqueInstance;

    private  TwistState(){};

    public static TwistState getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new TwistState();
        }
        return uniqueInstance;
    }
    public void setState(BlackJack game, Player player, BlackJackAction action) {
        player.getHand().add(game.getDeck().playACard());
        PlayerState state = this;
        if (game.getScore(player.getHand()) > game.maxScore){
            state = EndState.getInstance();
        }
        else {
            state = ReadyToPlayState.getInstance();
        }
        game.setPlayerState(state, player, action);
    }

    public BlackJackAction getState(){
        return BlackJackAction.TWIST;
    }

}
