class Array {
    public static void main(String[] args) {  
        int[] numArray = {20, 3, 6, 10, 13, 25, 100, 6, 3, 20, 5102};
        //q#1
        System.out.println( numArray[3] );
        //10
        //System.out.println( numArray[11] );
        //not in the arrays range.
        System.out.println( numArray[1] );
        //3
        System.out.println( numArray[7] );
        //6
        System.out.println( numArray[8] );
        //3
        //q#2
        System.out.println( numArray[4] );
        
        System.out.println( numArray[1] );
        //    /|\ or \|/
        System.out.println( numArray[8] );
       
        System.out.println( numArray[10] );
        System.out.println( numArray[5] );
        System.out.println( numArray[0] );
        //q#3
        int[] fibonacci = {1, 1, 2, 3, 0, 8, 13, 0, 34, 0};
        fibonacci[4] = fibonacci[3] + fibonacci[2];
        System.out.println( fibonacci[4] );
        fibonacci[7] = fibonacci[6] + fibonacci[5];
        System.out.println( fibonacci[7] );
        fibonacci[9] = fibonacci[8] + fibonacci[7];
        System.out.println( fibonacci[9] );
    }
    }
