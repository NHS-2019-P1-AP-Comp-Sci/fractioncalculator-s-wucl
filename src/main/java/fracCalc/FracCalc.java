/**
 * @author Mr. Rasmussen
 */

package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args)
    {
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter a fraction problem: ");
    	String userResponse = s.nextLine();
    	
    	while (!s.equals("quit")) {
    		System.out.println(produceAnswer(userResponse));
    		System.out.print("Enter a fraction problem: ");
        	userResponse = s.nextLine();
    	}
    	System.out.println("Program Ended.");
    }

    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input){
    	String temp = input
    	String operand1 = temp.substring(0, temp.indexOf(' '));
    	temp = temp.substring(temp.indexOf(' ') + 1);
    	String operator = temp.substring(0, temp.indexOf(' '));
    	temp = temp.substring(temp.indexOf(' ') + 1);
    	String operand2 = temp;
    	String temp = "";
    	for(int i - 0; i < input.length(); i++) {
    		if(input.charAt(i) == ' ') {
    			if(operand1.equals("")) {
    				operand1 = temp;
    				temp = "";
    			}else {
    				operator = temp;
    				temp = "";
    			}
    		}else if (i == input.length()- 1) {
    			temp += input.charAt(i);
    			operand2 = temp;
    		}else {
    			temp += input.charAt(i);
    		}
    	}
    	Scanner s = new Scanner(input);
    
        return operand1;
    }


}
