package Display;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput extends Input {
    private Scanner userInput = new Scanner(System.in);
    private List<String> inputValues = new ArrayList<String>();

    public void addInputValue(String inputValue) {
        this.inputValues.add(inputValue);
    }

    public void clear(){
        this.inputValues.clear();
    }

    public String getString(){
        String result = "";
        if (inputValues.size() == 0) {
            result = userInput.nextLine();
        } else {
            result = inputValues.remove(0);
        }
        return result;
    }
}