package BlackJack;

import java.util.HashMap;
import java.util.Map;

public enum BlackJackAction {
    TWIST("Twist"),
    STICK("Stick"),
    READY_TO_PLAY("Ready to Play"),
    END("End");

    private String fullName;
    private static final Map<String, BlackJackAction> lookup = new HashMap<String, BlackJackAction>();

    BlackJackAction(String fullName) {
        this.fullName = fullName;
    }

    static {
        for (BlackJackAction action : BlackJackAction.values()) {
            lookup.put(action.fullName.substring(0, 1), action);
        }
    }

    public String display() {
        return fullName;
    }

    public static BlackJackAction getAction(String shortCode) {
        return lookup.get(shortCode);
    }

}
