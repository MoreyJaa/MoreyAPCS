class forloops2 {
    public static void main(String[] args) {  
        //will print 0-50 by twos
        //--printed 0-100 by twos
        for(int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
        //it will print all the multiples of three from 0-100, and if they are even or odd.
        //--did so
        for(int i = 0; i <= 100; i += 3) {
            if(i % 2 == 0) {
                System.out.println(i + " is an even number");
            }
            else {
                System.out.println(i + " is an odd number");            
            }
        }
        //it will print the powers of two up untill 512
        //--did so
        for(int i = 1; i < 1000; i += i) {
            System.out.println(i);
        }
        //it will print 100-0
        //--doesnt meet conditions
        for(int i = 100; i < 0; i--) {
            System.out.println(i);
        }
        
        System.out.println("---------------------------NEW");
        
        for(int i = 0; i > -100; i--) {
            System.out.println(i);
        }
        for(int i = 1; i < 20; i *= 2) {
            System.out.println(i);
        }
        for(int i = 0; i < 100; i += 3) {
            System.out.println(i);
        }
        for(int i = 1; i <= 1024; i *= 2) {
            System.out.println(i);
        }
    }
}