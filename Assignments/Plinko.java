import java.util.Scanner;

class Plinko {
    public static final int SINGLE_DISC = 1;
    public static final int MULTI_DISC = 2;
    public static final int TERMINATE = 3;

    public static final int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};

    public static int mode = -1;
    public static int startingPosition = -1;
    public static int numDiscs = 1;
    public static Boolean egg = false;
    public static int[] slotVALUES = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static int totalPoints = 0;

    public static void main(String[] args) {
        Scanner scan;
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            Boolean isMultiDisc = false;
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == SINGLE_DISC) {
                    isMultiDisc = false;
                }
                else if(mode == MULTI_DISC) {
                    isMultiDisc = true;
                }
                else if(mode == TERMINATE) {
                    System.out.println("Goodbye");
                    break;
                } else {
                    continue;
                }
            }

            collectSettings(isMultiDisc);
            runPlinko(isMultiDisc);
        }
    }

    public static void runPlinko(Boolean isMultiDisc) {
        if (isMultiDisc) {
            int slotVALUES[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for(int j = 1; j <= numDiscs; j++) {
                int discPosition = startingPosition;
                for(int i = 0; i <= 12; i++) {
                    if (discPosition == 16) {
                        discPosition = discPosition - 1;
                    }
                    else if (discPosition == 0) {
                        discPosition = discPosition + 1;
                    }
                    else {
                        int n = (int) (Math.random() * 2);
                        if (n == 0) {
                            discPosition = discPosition - 1;
                        }
                    else if (n == 1) {
                        discPosition = discPosition + 1;
                    }
                }
            }
            slotVALUES[(discPosition / 2)]++;
            }
            for(int h = 0; h <= 8; h++) {
                System.out.println("Discs in slot " + h + ": " + slotVALUES[h]); 
                totalPoints += slotVALUES[h] * VALUES[h];
            }
            if(numDiscs == 1) {
            System.out.println("Congratulations, you scored " + totalPoints + " points with your drop");
            }
            else {
                System.out.println("Congratulations, you scored " + totalPoints + " points with all " + numDiscs + " of your drops!");
            }
        } else if (egg) {
            printEvenRow(startingPosition);
            for(int n = 0; n <= 6; n++) {
                printOddRow(startingPosition);
                printEvenRow(startingPosition);
            }
            System.out.println("Congratulations, you landed in slot ███ and won ███ ██████!");
            egg = false;
        }
        else {
            printEvenRow(startingPosition);
            for(int i = 0; i <= 6; i++) {
                if (startingPosition == 16) {
                    startingPosition = startingPosition - 1;
                }
                else if (startingPosition == 0) {
                    startingPosition = startingPosition + 1;
                }
                else {
                    int n = (int) (Math.random() * 2);
                    if (n == 0) {
                        startingPosition = startingPosition - 1;
                    }
                else if (n == 1) {
                    startingPosition = startingPosition + 1;
                }
                }
                printOddRow(startingPosition);
                if (startingPosition == 16) {
                    startingPosition = startingPosition - 1;
                }
                else if (startingPosition == 0) {
                    startingPosition = startingPosition + 1;
                }
                else {
                    int n = (int) (Math.random() * 2);
                    if (n == 0) {
                        startingPosition = startingPosition - 1;
                    }
                else if (n == 1) {
                    startingPosition = startingPosition + 1;
                }
                }
                printEvenRow(startingPosition);
            }
            System.out.println("Congratulations, you landed in slot " + (startingPosition / 2) + " and won " + VALUES[startingPosition / 2] + " dollars!");
        }
    }

        

    public static void printOddRow(int discPosition) {
        for(int i = 0; i <= 18; i++) {
            if(discPosition == i) {
                System.out.print("O");
            }
            else if(!isEven(i)) {
                System.out.print(" ");
            }
            else if (i < 17) {
                System.out.print(".");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }

    public static void printEvenRow(int discPosition) {
        for(int i = 0; i <= 18; i++) {
            if(discPosition == i) {
                System.out.print("O");
            }
            else if(isEven(i) && i < 17) {
                System.out.print(" ");
            }
            else if(i < 17) {
                System.out.print(".");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }

    public static void collectSettings(Boolean isMultiDisc) {
        Scanner scan;
        Boolean isValidInput = false;
        while(!isValidInput) {
            scan = new Scanner(System.in);
            System.out.print("Pick a slot to drop the disc(s) (0-8): ");
            if(scan.hasNextInt()){
                startingPosition = scan.nextInt() * 2;
                if(0 <= startingPosition && startingPosition <= 18) {
                    if(startingPosition == 18) {
                        egg = true;
                        return;
                    } else {
                        isValidInput = true;    
                    }
                }
            }
        }

        //How many discs will be dropped?
        isValidInput = false;
        if(isMultiDisc) {
            while(!isValidInput) {
                scan = new Scanner(System.in);
                System.out.print("Enter # of discs to drop: ");
                if(scan.hasNextInt()){
                    numDiscs = scan.nextInt();
                    if(numDiscs > 0) {
                        isValidInput = true;
                    }
                }
            }
        }
    }

    public static Boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t(1) Single disc\n"
            + "\t(2) Multiple discs\n"
            + "\t(3) Quit\n"
        );
    }
}