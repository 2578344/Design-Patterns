package BlackJack;

import Display.OverrideInput;
import Player.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EndStateTest {
    private EndState endState = EndState.getInstance();
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