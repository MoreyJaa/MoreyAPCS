class loops1 {
    public static void main(String[] args) {  
        int n1 = 0;
        while(n1 < 100) {
            System.out.println(n1);
            n1 += 5;
        }
        System.out.println("-------------------------------------------------");
        int n2 = 19;
        while(n2 % 2 == 0) {
            System.out.println(n2);
            n2--;        
        }
        System.out.println("-------------------------------------------------");
        int n3 = 1;
        while(n3 < 100) {
            System.out.println(n3);
            n3 += n3;        
        }
        System.out.println("-------------------------------------------------");
        Boolean shouldLoop = true;
        int n4 = 0;
        while(shouldLoop) {
            if(n4 == 20) {
                shouldLoop = false;
            }
            System.out.println(n4);
            n4++;
        }
        System.out.println("-------------------------------------------------");
        int n5 = 0;
        while(true) {
            System.out.println("Hello World");
            n5++;
            if(n5 == 10){
                break;
            }
        }
        System.out.println("NEWNEW-------------------------------------------------");
        int n6 = 1;
        while(n6 < 10) {
            System.out.println(n6);
            n6++;
        }
        System.out.println("-------------------------------------------------");
        Boolean shouldLoop2 = true;
        int n7 = 1;
        while(shouldLoop2) {
            if(n7 == 100) {
                System.out.println("100 loop passes occured.");
                break;
            }
            n7++;
    }
    System.out.println("NEWNEWNEW-------------------------------------------------");
        int n8 = 100;
        while(n8 > -101) {
            System.out.println(n8);
            n8--;
        }
        System.out.println("-------------------------------------------------");
        int n9 = 3;
        while(n9 < 121) {
            System.out.println(n9);
            n9 += 3;
        }
        System.out.println("-------------------------------------------------");
        char n10 = 'a';
        int n11 = 1;
        while(n11 < 27) {
            System.out.println(n10);
            n10++;
            n11++;
        }
    }
}