class test {
    static double money = 20.5;
    static int burgersEaten = 2;
    static double burgerCost = 5;

    public static void main(Strings[] args) {
        double x = dietWatcher(money, burgerCost);
    
    System.out.println("You have $" + money + ", and have eaten " + burgersEaten + " burgers.");
    System.out.println("Burgers cost $" + burgerCost + "." );

    double x = dietWatcher(money, burgerCost);

    if(dietWatcher(x) && burgersEaten < 2 ) {
        System.out.println("You could buy a burger...");
        System.out.println("And you could eat it!");
    } else if(dietWatcher(x)) {
        System.out.println("You could buy a burger...");
        System.out.println("But you've had enough!");
    } else {
        System.out.println("You cannot afford a burger...");
        System.out.println("Even if you could have one.");
    }
        System.out.println(" ");
        resetBurgers(burgersEaten);
        System.out.println("It will be a new day...");

    }

    public static Boolean dietWatcher(double x, int y) {
        return x / y > 0;
    }
    public static void resetBurgers(int x) {
        burgersEaten = 0;
    }
}