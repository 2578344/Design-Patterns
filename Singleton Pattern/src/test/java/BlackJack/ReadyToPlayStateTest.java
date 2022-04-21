package BlackJack;

import Display.OverrideInput;
import Player.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReadyToPlayStateTest {

    private PlayerState readToPlayState = ReadyToPlayState.getInstance();
    private BlackJack blackJack = new BlackJack();
    private OverrideInput overrideInput = new OverrideInput();

    @org.junit.jupiter.api.Test
    void setStateTwist() {
        blackJack.clearListOfState();
        overrideInput.setInputValue("2,Derek,T,S,E");
        blackJack.setUserInput(overrideInput);
        blackJack.initiate();
        Player player = blackJack.players.get(0);
        readToPlayState.setState(blackJack, player, BlackJackAction.TWIST );
        assertTrue(blackJack.listOfStates.get(0) instanceof TwistState);
    }

    @org.junit.jupiter.api.Test
    void setStateStick() {
        blackJack.clearListOfState();
        overrideInput.setInputValue("2,Derek,S,E");
        blackJack.setUserInput(overrideInput);
        blackJack.initiate();
        Player player = blackJack.players.get(0);
        readToPlayState.setState(blackJack, player, BlackJackAction.STICK );
        assertTrue(blackJack.listOfStates.get(0) instanceof StickState);
    }

    @org.junit.jupiter.api.Test
    void getState() {
        assertEquals(BlackJackAction.READY_TO_PLAY, readToPlayState.getState());
    }
}