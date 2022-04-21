package BlackJack;

import Display.OverrideInput;
import Player.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StickStateTest {
    private StickState stickState = StickState.getInstance();
    private BlackJack blackJack = new BlackJack();
    private OverrideInput overrideInput = new OverrideInput();
    
    @org.junit.jupiter.api.Test
    void isOfType() {
        assertTrue(stickState instanceof PlayerState);
    }

    @org.junit.jupiter.api.Test
    void setState() {
        blackJack.clearListOfState();
        overrideInput.setInputValue("2,Derek,S,E");
        blackJack.setUserInput(overrideInput);
        blackJack.initiate();
        Player player = blackJack.players.get(0);
        stickState.setState(blackJack, player, BlackJackAction.STICK );
        assertTrue(blackJack.listOfStates.get(0) instanceof EndState);
    }

    @org.junit.jupiter.api.Test
    void getState() {
        assertEquals(BlackJackAction.STICK, stickState.getState());
    }
}