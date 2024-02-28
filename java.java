public class LightSwitcher {
    private boolean isLightOn = false;

    public void turnOn() {
        isLightOn = true;
        System.out.println("Light turned on");
        // Add code to control the light switch and turn the light on
    }

    public void turnOff() {
        isLightOn = false;
        System.out.println("Light turned off");
        // Add code to control the light switch and turn the light off
    }

    public boolean isLightOn() {
        return isLightOn;
    }

    public static void main(String[] args) {
        LightSwitcher lightSwitcher = new LightSwitcher();

        // Example: Turn the light on
        lightSwitcher.turnOn();

        // Example: Turn the light off
        lightSwitcher.turnOff();
    }
}
