package BlackJack;

import Player.Player;

public interface PlayerState {

    public abstract void setState(BlackJack game, Player player, BlackJackAction action);
    public abstract BlackJackAction getState();
}
