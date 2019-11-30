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
    	String temp = "";
    	String operand1 = "";
    	String operand2 = "";
    	String operand3 = "";
    	
    	String op2Whole = findWhole(operand2);
    	String op2Num = findNum(operand2);
    	String op2Denom = findDenom(operand2);
    	
    	String chk2Answer = "whole:" + op2Whole + " numerator:" +
    						op2Num + " denominator:" + op2Denom;
    	
    	public static String findWhole(String str) {
    		// This could be a mixed number, a fraction, or a whole number
    		if(str.contains("_")) {
    			return str.substring(0, str.indexOf('_'));
    		}
    		if(str.contains("/")) {
    			return "0";
    		}
    		else return str;
    	}
    	public static String findNum(String str) {
    		if(str.contains("_")) {
    			return str.substring(str.indexOf('_') + 1, str.indexOf('/'));
    		}else if(str.contains("/")) {
    			return str.substring(0, str.indexOf('/'));
    		}else {
    			return "0";
    		}
    	}
    	public static String findDenom(String str) {
    		if(str.contains("/")) {
    			str.substring(str.indexOf("/")+1);
    		}
    	}
    	for (int i = 0; i < input.length(); i++) {
    		if (input.charAt(i) == ' ') {    			
    			if (operand1.equals("")) {
    				operand1 = temp;
        			temp = "";
    			}
    			else {
        			operand2 = temp;
        			temp = "";
        		}
    		}
    		else if () {
    			
    		}
    	}
    	   public static int produceAnswer(String input){ 
    		      String frac1 = input.substring(0, input.indexOf(" "));
    		      String operator = input.substring(input.indexOf(" ") + 1, input.indexOf(" ") + 2);
    		      String frac2 = input.substring(input.indexOf(" ") + 3);
    		      String whole1 = frac1;
    		      String numerator1 = "0";
    		      String denominator1 = "1";
    		      if (frac1.indexOf("/") != -1){
    		        if (frac1.indexOf("_") != -1){
    		          whole1 = frac1.substring(0, frac1.indexOf("_"));
    		        }else{
    		          whole1 = "0";
    		        }
    		        numerator1 = frac1.substring(frac1.indexOf("_") + 1, frac1.indexOf("/"));
    		        denominator1 = frac1.substring(frac1.indexOf("/") + 1, frac1.length());
    		      }
    		      String whole2 = frac2;
    		      String numerator2 = "0";
    		      String denominator2 = "1";
    		      if (frac2.indexOf("/") != -1){
    		        if (frac2.indexOf("_") != -1){
    		          whole2 = frac2.substring(0, frac2.indexOf("_"));
    		        }else{
    		          whole2 = "0";
    		        }
    		        numerator2 = frac2.substring(frac2.indexOf("_") + 1, frac2.indexOf("/"));
    		        denominator2 = frac2.substring(frac2.indexOf("/") + 1, frac2.length());
    		      }
    		      int result = Integer.valueOf(numerator2);
    /*	
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
    */
        return operand1;
    }

}
