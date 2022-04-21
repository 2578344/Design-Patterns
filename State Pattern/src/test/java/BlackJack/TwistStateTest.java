package BlackJack;

import CardGame.Hand;
import Display.OverrideInput;
import Player.Player;
import Player.PlayerType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwistStateTest {
    private TwistState twistState = new TwistState();
    private BlackJack blackJack = new BlackJack();
    private OverrideInput overrideInput = new OverrideInput();
    
    @org.junit.jupiter.api.Test
    void isOfType() {
        assertTrue(twistState instanceof PlayerState);
    }

    @org.junit.jupiter.api.Test
    void setStateTwistThreeCards() {
        BlackJack blackJack = new BlackJack();
        blackJack.clearListOfState();
        overrideInput.setInputValue("2,Derek,E");
        blackJack.setUserInput(overrideInput);
        blackJack.initiate();
        Player player = blackJack.players.get(0);
        twistState.setState(blackJack, player, BlackJackAction.END );
        assertEquals(3, player.getHand().size());
    }

    @org.junit.jupiter.api.Test
    void setStateTwistBust() {
        BlackJack blackJack = new BlackJack("S3,S4,SK,SQ,SJ");
        blackJack.clearListOfState();
        overrideInput.setInputValue("2,Derek,S,E");
        blackJack.setUserInput(overrideInput);
        blackJack.initiate();
        Player player = blackJack.players.get(0);
        twistState.setState(blackJack, player, BlackJackAction.TWIST );
        assertTrue(blackJack.listOfStates.get(0) instanceof EndState);
    }

    @Test
    void getState() {
        assertEquals(BlackJackAction.TWIST, twistState.getState());
    }
}