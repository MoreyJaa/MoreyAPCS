class CruiseControl {
	static Boolean cruiseControlSet = false;
	static int speed = 0;
	static final int MAX_SPEED = 45;
	static int warningSpeed = 30;

	public static void main(String[] args) {
		//accelerate(5);
		//decelerate(5);
		toggleCruiseControl();
		
		for(int i = 0; i < 45; i++) {
		accelerate(10);	
		}

		for(int i = 0; i < 45; i++) {
		decelerate(10);	
		}
		
		toggleCruiseControl();
        //decelerate(5);
		//accelerate(5);
	}

	public static void toggleCruiseControl() {
		cruiseControlSet = !cruiseControlSet;

		if(cruiseControlSet) {
			System.out.println("Cruise Control Enabled");
		} else {
			System.out.println("Cruise Control Disabled");
			speed = 0;
		}	
	}

	public static void accelerate(int r) {
		int x = (int) (Math.random() * r) + 1;
		if (cruiseControlSet && (speed < MAX_SPEED)) {
			reportSpeed();

			if (speed + x > MAX_SPEED) {
				int n = speed + x - MAX_SPEED;
				speed = MAX_SPEED;
				System.out.println("Your speed was cut off by " 
									+ n 
									+ "mph to avoid going over your set max limit of " 
									+ MAX_SPEED + "mph.");
				reportSpeed();
			} else { speed += x;
				if(exceedsWarningThreshold(speed)) {
				alert(false);
				}
			}
		} else {
			return;
		}
		if (speed == MAX_SPEED) {
			System.out.println("Max speed reached.");
		}
		
	}

	public static void decelerate(int r) {
        int y = (int) (Math.random() * r) + 1;
		if (cruiseControlSet && speed > 0) {
			speed -= y;
			if (speed < 0) {
				speed = 0;
			}
			reportSpeed();
			if (exceedsWarningThreshold(speed)) {
        		alert(true);
			}
    	}
	}

	public static void reportSpeed() {
    System.out.println("Current speed: \t" + speed + "mph");
	}

	public static void alert(Boolean isDecelerating) {
		if(isDecelerating) {
			System.out.println("Speed still exceeds the warning threshold.");
		}
		else {
			System.out.println("Speed exceeds the warning threshold.");			
		}
	
		System.out.println("Threshold: \t" + speed + "/" + warningSpeed + "mph");
	}

	public static Boolean exceedsWarningThreshold(int speed) {
		return speed > warningSpeed;
	}
}