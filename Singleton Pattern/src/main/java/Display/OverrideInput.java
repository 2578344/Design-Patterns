package Display;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OverrideInput extends Input{
    private List<String> inputValues = new ArrayList<String>();

    public void setInputValues(ArrayList<String> inputValues){
        this.inputValues = inputValues;
    }
    public void setInputValue(String listOfInputs) {
        for (String input : listOfInputs.split(",")) {
            this.inputValues.add(input);
        }
    }

    public void clear(){
        this.inputValues.clear();
    }

    public String getString(){
        return inputValues.remove(0);
    }

}
