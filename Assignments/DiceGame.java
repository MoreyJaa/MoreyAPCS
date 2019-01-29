class DiceGame {
    public static void main(String[] args) {
        int i = 0;
        while (i < 2147483647) {
        int r4 = getD4();
        System.out.println("Your D4 rolled a\t" +  r4);
        int r6 = getD6();
        System.out.println("Your D6 rolled a\t" + r6);
        int r20 = getD20();
        System.out.println("Your D20 rolled a\t" + r20);
        System.out.println("-----------------------------" + "roll#:" + i);
        i++;
        }
    }
    public static int getD4() {
        return (int) (Math.random() * 4) + 1;
    }

    public static int getD6() {
        return (int) (Math.random() * 6) + 1;
    }

    public static int getD20() { 
        return (int) (Math.random() * 20) + 1;
    }
}