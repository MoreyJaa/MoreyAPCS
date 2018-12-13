
class Operators {
    public static void main(String args[]) {
        //String firstName = "Ash";
        //String lastName = "Morey";
        //String fullName = firstName + " " + lastName;
        
        //System.out.println(firstName);
        //System.out.println("firstName");
        //System.out.println(lastName);
        //System.out.println("lastName");
        //System.out.println(fullName);
        //System.out.println("fullName");
        
        //int currentYear = 2018;
        //int yearsUntilGraduation = 3;
        //int myGradYear = currentYear + yearsUntilGraduation;
        //System.out.println(myGradYear);
        //System.out.println("myGradYear");
       
        //int currentAge = 15;
        //int nextAge = currentAge + 1;
        //System.out.println(currentAge);
        //System.out.println(nextAge);

        //int halfCurrentAge = currentAge / 2;
        //int halfNextAge = nextAge / 2;
        //System.out.println(halfCurrentAge);
        //System.out.println(halfNextAge);

        //modula is checking for even/odd
        //int moduloCurrentAge = currentAge % 2;
        //int moduloNextAge = nextAge % 2;
        //System.out.println(moduloCurrentAge);
        //System.out.println(moduloNextAge);


        //code to see how many months until I reach my savings goal.
        int targetSavingsGoal = 1000;
        double savingsPerMonth = 20.5;
        double monthsTilGoal = targetSavingsGoal / savingsPerMonth;
        System.out.println("It will be " + monthsTilGoal + " months until I reach my goal of $" + targetSavingsGoal );
        // random sentences code
        String firstWord = "the";
        String secondWord = "state";
        String thirdWord = "of";
        String fourthWord = "horror";
        String fifthWord = "movies";
        String sixthWord = "in";
        String seventhWord = "modern";
        String eighthWord = "day";
        String ninthWord = "is";
        String tenthWord = "absolutely";
        String eleventhWord = "appaling";
        String twelfthWord = "quality";
        String thirteenthWord = "seems";
        String fourteenthWord = "rapidly";
        String fifteenthWord = "declining";
        System.out.println( fifteenthWord + " " + ninthWord + " " + fourteenthWord + " " + eleventhWord + " " + eighthWord + " " + tenthWord + " " + thirdWord + " " + sixthWord + " " + secondWord + ".");
        System.out.println( ninthWord + " " + fifthWord + " " + secondWord + " " + tenthWord + " " + twelfthWord + " " + tenthWord + " " + thirteenthWord + ".");
        System.out.println( sixthWord + " " + fourteenthWord + " " + eleventhWord + " " + firstWord + " " + eighthWord + " " + seventhWord + " " + fifteenthWord + " " + thirdWord + ".");
        //if else tree code
        Boolean hasGirlfriend = false;
        Boolean hasMoney = true;
        Boolean hasJob = false;
        if(hasGirlfriend) {
            System.out.println("Success!");
        }
        if(hasMoney || hasJob) {
            System.out.println("You can do it!");
        }
        else {
            System.out.println("a proud single life statement!");
	}
    }
}