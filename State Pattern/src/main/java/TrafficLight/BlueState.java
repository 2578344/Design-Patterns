package TrafficLight;

public class BlueState implements ColourState{
    private TrafficLight trafficLight;
    public BlueState(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }
    @Override
    public void setState() {
        this.trafficLight.setColourState(new RedState(this.trafficLight));
    }

    @Override
    public String getColour() {
        return LightColour.BLUE.getColour();
    }
}
