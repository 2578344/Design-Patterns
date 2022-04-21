package BlackJack;

import Player.Player;

public class TwistState implements PlayerState{

    public static TwistState uniqueInstance = null;
    public static TwistState getInstance(){
        if (uniqueInstance == null){
            uniqueInstance =  new TwistState();
        }
        return uniqueInstance;
    }

    public void setState(BlackJack game, Player player, BlackJackAction action) {
        game.userOutput.output("Twist");
        player.getHand().add(game.getDeck().playACard());
        int playerScore = game.getScore(player.getHand());
        if(playerScore > game.maxScore){
            game.setPlayerState(new EndState(),  player, action);
        }
        else{
            game.setPlayerState(new ReadyToPlayState(),  player, action);
        }

    }
    public BlackJackAction getState(){
        return BlackJackAction.TWIST;
    }

}
