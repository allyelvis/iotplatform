public class LightSwitcher {
    public static void main(String[] args) {
        String command = args[0];
        
        if (command.equals("on")) {
            System.out.println("Turning the light on...");
            // Implement logic to turn the light on
        } else if (command.equals("off")) {
            System.out.println("Turning the light off...");
            // Implement logic to turn the light off
        } else {
            System.out.println("Invalid command");
        }
    }
}
