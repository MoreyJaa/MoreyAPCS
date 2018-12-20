class CruiseControl {
    static Boolean cruiseControlSet = false;
    static int speed = 0;
    static final int MAX_SPEED = 45;
    static int warningSpeed = 25;

    public static void main(String[] args) {
        toggleCruiseControl();

        accelerate();
    }

    public static void toggleCruiseControl() {
        cruiseControlSet = !cruiseControlSet;
        if(cruiseControlSet) {
            System.out.println("Cruise Control Enabled"); 
        } else {
            System.out.println("Cruise Control Disabled"); 
            speed = 0;
    }

    public static void accelerate() {
        if (cruiseControlSet && speed < MAX_SPEED) {
            speed += 1;
        else {
            System.out.println("Max Speed Reached");
        }
            System.out.println("Current speed: \t" + speed + "mph");
        if (exceedsWarningThreshold(speed));
        alert(false);
        }
    }

    public static void deccelerate() {
    alert(true);
    }

    public static void reportSpeed() {

    }

    public static void alert(Boolean isDecelerating) {
        if (isDecelerating) {
            System.out.println("Speed still exceeds the warning threshold." )
        }
        System.out.println("Threshold \t" + speed + "/" + warningSpeed + "mph")
    }

    public static Boolean exceedsWarningThreshold(int speed) {
        return speed > warningSpeed;
    }
}