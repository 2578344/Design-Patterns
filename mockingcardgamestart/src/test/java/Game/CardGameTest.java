package Game;

import Console.ConsoleInput;
import Structure.Hand;
import Structure.LoadConfig;
import Structure.Player;
import Structure.PlayerType;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CardGameTest {
    CardGame cardGame = new CardGame();

    @Test
    void getDeck() {
        assertEquals(52, cardGame.getDeck().size());
    }

    @Test
    void cardGameOverride(){
        CardGame overrideCardGame = new CardGame("H3,H4,H5,D6");
        assertEquals(4, overrideCardGame.getDeck().size());
    }

    @Test
    void dealCards() {
        CardGame cardGame = new CardGame("D3,D2,S5,S6");
        Hand hand = new Hand();
        hand = cardGame.dealHand(hand, 3);
        assertEquals("S6, S5, D2", hand.toString());
    }

    @Test
    void outputOne(){
        cardGame.output("Test One");
        assertEquals("Test One", cardGame.userOutput.getStoreOutput().get(0));
    }

    @Test
    void outputTwo(){
        cardGame.output("Test One");
        cardGame.output("Test Two");
        assertEquals("Test Two", cardGame.userOutput.getStoreOutput().get(1));
    }

    @Test
    void outputTwoCount(){
        cardGame.output("Test One");
        cardGame.output("Test Two");
        assertEquals(2, cardGame.userOutput.getStoreOutput().size());
    }


    @Test
    void getNumberOfPlayers(){
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("3");
        cardGame.userInput.setUserInput(mockScanner);
        assertEquals(3, cardGame.getNumberOfPlayers());
    }

    @Test
    void getInteger(){
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("3");
        cardGame.userInput.setUserInput(mockScanner);
        assertEquals(3, cardGame.getInteger());
    }

    @Test
    void getIntegerFirstString(){
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("one");
        when(mockScanner.nextLine()).thenReturn("25");
        cardGame.userInput.setUserInput(mockScanner);
        assertEquals(25, cardGame.getInteger());
    }

    @Test
    void getString(){
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("yes");
        cardGame.userInput.setUserInput(mockScanner);
        assertEquals("yes", cardGame.getString());
    }

    @Test
    void getComputerPlayersNames(){
        LoadConfig mockLoadcon = mock(LoadConfig.class);
        List<String> names = new ArrayList<String>();
        names.add("Bob");
        when(mockLoadcon.getConfig()).thenReturn(names);
        cardGame.setLoadConfig(mockLoadcon);
        assertEquals("Bob", cardGame.getComputerPlayersNames().get(0));
        names.add("Susan");
        names.add("Alan");
        when(mockLoadcon.getConfig()).thenReturn(names);
        cardGame.setLoadConfig(mockLoadcon);
        assertEquals("Bob", cardGame.getComputerPlayersNames().get(0));
        assertEquals("Susan", cardGame.getComputerPlayersNames().get(1));
        assertEquals("Alan", cardGame.getComputerPlayersNames().get(2));
    }

    @Test
    void createComputerPlayers(){
        LoadConfig mockLoadcon = mock(LoadConfig.class);
        List<String> names = new ArrayList<String>();
        names.add("Computer1");
        names.add("Computer2");
        names.add("Computer3");
        when(mockLoadcon.getConfig()).thenReturn(names);
        cardGame.setLoadConfig(mockLoadcon);
        assertEquals("Computer3", cardGame.getComputerPlayersNames().get(2));

    }

    @Test
    void createComputerPlayersSize(){
        LoadConfig mockLoadcon = mock(LoadConfig.class);
        List<String> names = new ArrayList<String>();
        names.add("Computer1");
        names.add("Computer2");
        names.add("Computer3");
        when(mockLoadcon.getConfig()).thenReturn(names);
        cardGame.setLoadConfig(mockLoadcon);
        cardGame.createComputerPlayers(3);
        assertEquals(3, cardGame.players.size()+1);
    }

    @Test
    void createHumanPlayer(){
        ConsoleInput mockUserInput = mock(ConsoleInput.class);
        when(mockUserInput.getString()).thenReturn("Anna");
        cardGame.setUserInput(mockUserInput);
        cardGame.players.add(new Player(PlayerType.USER,cardGame.getString(),0));
        assertEquals("Anna", cardGame.players.get(0).getName());
    }

    @Test
    void initiatePlayers(){
        ConsoleInput mockUserInput = mock(ConsoleInput.class);
        when(mockUserInput.getString()).thenReturn("Anna");
        cardGame.setUserInput(mockUserInput);
        cardGame.players.add(new Player(PlayerType.USER,cardGame.getString(),0));

        when(mockUserInput.getInteger()).thenReturn(1);
        cardGame.setUserInput(mockUserInput);
        cardGame.createComputerPlayers(cardGame.getInteger());
        assertEquals(2, cardGame.players.size());
    }

    @Test
    void initiate(){
        ConsoleInput mockUserInput = mock(ConsoleInput.class);
        when(mockUserInput.getInteger()).thenReturn(2);
        cardGame.setUserInput(mockUserInput);
        cardGame.createComputerPlayers(cardGame.getInteger());
        cardGame.dealCards();
        assertEquals(true,cardGame.players.get(0).hasHand());

    }

    @Test
    void play(){
        ConsoleInput mockUserInput = mock(ConsoleInput.class);
        when(mockUserInput.getInteger()).thenReturn(2);
        cardGame.setUserInput(mockUserInput);
        cardGame.createComputerPlayers(cardGame.getInteger());
        cardGame.dealCards();

    }

}