package BlackJack;

import Player.Player;

public interface PlayerState {

    public void setState(BlackJack game, Player player, BlackJackAction action);
    public BlackJackAction getState();
}
