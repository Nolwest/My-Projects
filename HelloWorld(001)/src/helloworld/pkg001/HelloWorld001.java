package helloworld.pkg001;

import java.util.Arrays;

public class HelloWorld001 {
  
    static String hello = new String("Hello World!");
    
    public static void main(String[] args) {
            
            int x;
            x = 8;
            int[] arrayForTests = new int[x];
 
            arrayForTests[5] = 62;
            int helloLength = hello.length();
            
           // System.out.println(hello.substring(0,5)); 
           // System.out.println(helloLength + " is the length of the string.");
           // System.out.println(arrayForTests[5]);
            
            int [] testArray1 = {21, 23, 34, 45, 56, 78, 99};
            int [] copyTestArray1 = Arrays.copyOfRange(testArray1, 0, 7);
            
            Arrays.sort(copyTestArray1);
            
            String arrayString = Arrays.toString(copyTestArray1);
            
            System.out.println(arrayString.substring(1, arrayString.length()-1));
            System.out.println(testArray1.length);
    
            

    }
}
