public class TrafficLight {

    private int id;
    private int lightAmount;
    private int currentColor;

    public TrafficLight() {
        id = 0;
        lightAmount = 3;
        currentColor = 1;
    }

    public TrafficLight(int id, int numberOfLights) {
        this.id = id;
        this.lightAmount = numberOfLights;
    }

    public String showColor(int light) {

        String result;
        switch (light) {
            case 1:
                System.out.println("Red");
                result = "Red";
                break;
            case 2:
                System.out.println("Orange");
                result = "Orange";
                break;
            case 3:
                System.out.println("Green");
                result = "Green";
                break;
            default:
                System.out.println("Red");
                result = "red";
                break;
        }
        return result;
    }

    public int showId() {
       return id;
    }

    public void showColorAndId(int light) {
        String result;
        result = showColor(light);

        System.out.println("My color is "
                + result
                + " and my id is: "
                + showId()
        );
    }

    public boolean isPositiveNumber(int number) {
        return number >= 0;
    }

    public int getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(int currentColor) {
        this.currentColor = currentColor;
    }

    public int getLightAmount() {
        return lightAmount;
    }

    public void setLightAmount(int lightAmount) {
        this.lightAmount = lightAmount;
    }
}
