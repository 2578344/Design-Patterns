package TrafficLight;

public enum LightColour {
    RED("Red"),
    AMBER("Amber"),
    GREEN("Green");

    private LightColour(String colour){
        this.colour = colour;
    }

    private final String colour;

    public String getColour(){
        return colour;
    }

}
