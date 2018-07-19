package plusorminus.pkg002;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOrMinus002 {
    
 
    
    public static void main(String[] args) {
       Scanner imput = new Scanner(System.in);
       long x = 0; 
       boolean overflow = false;
       
       while (true){
       System.out.println("Please write 'Increase' or 'Decrease' to increase or decrease the variable. It's current value is "+x+".");
       
       String plusOrMinus = imput.nextLine();
//Checking various imputs to various outputs.
       if(Arrays.asList("Increase","Increase.","increase","increase.").contains(plusOrMinus) && x < 100){
           if(overflow == true && x == -100){overflow = false;}
           x++;
       }
       
       else if(Arrays.asList("Decrease","Decrease.","decrease","decrease.").contains(plusOrMinus) && x > -100){
           if(overflow == true && x == 100){overflow = false;}
           x--;
       }
       else{System.out.println("Sorry, but '"+plusOrMinus+"' does not work. Please try again.");}
       
       
//Cutting it off if -100 or 100.
       if(overflow == true){
            System.out.println("The variable cannot go any higher or lower than 100 or -100.");
            }       

        if(x >= 100 || x <= -100){
           overflow = true;
           }else{
           overflow = false;
        }
    
       }
        
    }
    
}
