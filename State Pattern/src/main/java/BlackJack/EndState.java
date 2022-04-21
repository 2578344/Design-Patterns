package BlackJack;

import Display.OverrideInput;
import Player.Player;


public class EndState implements PlayerState{

    private PlayerState readToPlayState = new ReadyToPlayState();
    private OverrideInput overrideInput = new OverrideInput();
    
    public void setState(BlackJack game, Player player, BlackJackAction action){
        game.userOutput.output("End");
        game.determineWinner(game.players);

        /*
        if (action == BlackJackAction.END){
            game.userOutput.output("End");
            game.determineWinner(game.players);
        }
        else{

            game.clearListOfState();
            int sizeOfPlayers = game.players.size();

            overrideInput.setInputValue(""+sizeOfPlayers+","+game.players.get(1).getName());
            game.setUserInput(overrideInput);
            game.initiate();


        } */
    }

    public BlackJackAction getState(){
        return BlackJackAction.END;
    }
}
