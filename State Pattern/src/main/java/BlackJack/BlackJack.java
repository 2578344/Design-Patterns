package BlackJack;
import CardGame.Hand;
import CardGame.Card;
import CardGame.CardRank;
import Player.Player;
import CardGame.CardGame;
import CardGame.Deck;
import java.util.ArrayList;

public class BlackJack extends CardGame {
    public int maxScore = 21;
    private int ace_low = 1;
    protected PlayerState state;
    public ArrayList<PlayerState> listOfStates = new ArrayList<PlayerState>();
    
    public BlackJack(){
        super(new Deck());
    }

    public BlackJack(String override){
        super(new Deck(override));
    }

    public void setPlayerState(PlayerState state, Player player, BlackJackAction action){
        listOfStates.add(state);
        this.state = state;
        this.state.setState(this, player, action);
    }

    public PlayerState getPlayerState(){
        return state;
    }

    public void clearListOfState(){
        listOfStates.clear();
    }

    protected String generateHelp(){
        String help = "Please select one of the following options\n";
        for (BlackJackAction action : BlackJackAction.values()) {
            help += action.display() + "\n";
        }
        return help;
    }

    protected void help(){
        userOutput.output(generateHelp());
    }

    protected BlackJackAction getPlayerAction(Player player){
        String userChoice = " ";
        BlackJackAction userAction;
        help();
        if (player.hasHand()) {
            userOutput.outputHand(player.getHand());
        }
        userChoice = userInput.getString();
        userAction = BlackJackAction.getAction(userChoice.substring(0,1).toUpperCase());
        userOutput.output("You chose " + userAction.display());
        return userAction;
    }

    protected void userPlays(Player player, Deck deck){
        state = new ReadyToPlayState();
        state.setState(this, player, BlackJackAction.READY_TO_PLAY);
    }

    protected void computerPlays(Player player, Deck deck){
        Hand hand = player.getHand();
        while (getScore(hand) <= player.levelOfRisk){
            hand.add(deck.playACard());
        }
    }

    protected Player determineWinner(ArrayList<Player> players){
        Integer winningScore = 0;
        Player winningPlayer = null;
        int currentScore = 0;
        for (Player player : players){
            currentScore = getScore(player.getHand());
            if (currentScore <= maxScore && currentScore > winningScore){
                winningPlayer = player;
                winningScore = currentScore;
            }
        }
        if (winningPlayer != null) {
            winningPlayer.setWinner(true);
        }
        return winningPlayer;
    }


    public int getScore(Hand hand){
        int score = 0;
        Boolean hasAnAce = false;
        for (Card card: hand.getHandOfCards()){
            score += card.getRank().getValue();
            if (card.getRank() == CardRank.ACE) {
                hasAnAce = true;
            }
        }
        if (score > maxScore && hasAnAce){
            score -= CardRank.ACE.getValue() - ace_low;
        }
        return score;
    }

    public static void main(String[ ] args) {
        BlackJack blackJack = new BlackJack();
        blackJack.play();
    }


}
