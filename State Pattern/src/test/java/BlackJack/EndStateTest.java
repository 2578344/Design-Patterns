package BlackJack;

import CardGame.Hand;
import Display.OverrideInput;
import Player.Player;
import Player.PlayerType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndStateTest {
    private EndState endState = new EndState();
    private OverrideInput overrideInput = new OverrideInput();
    @Test
    void setState() {
        BlackJack blackJack = new BlackJack("S3,S4,SK,SA");
        blackJack.clearListOfState();
        overrideInput.setInputValue("2,Derek,E");
        blackJack.setUserInput(overrideInput);
        blackJack.initiate();
        Player player = blackJack.players.get(0);
        //player.setHand(new Hand("SK,SA"));
        endState.setState(blackJack, player, BlackJackAction.END );
        assertTrue(player.hasWon());
    }

    @org.junit.jupiter.api.Test
    void getState() {
        assertEquals(BlackJackAction.END, endState.getState());
    }
}