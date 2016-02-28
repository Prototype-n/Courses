package test;
import java.util.Scanner;
public class Test {
	
	public static void main(String[] args) {
		fvjgfgfghfhfgh
		
		vjvjvjvjj
		 Scanner sc = new Scanner(System.in);
	        int firstOperand, secondOperand;
	        char operation;
	 
	        System.out.println("Enter 1st operand:");
	        firstOperand = sc.nextInt();
	 
	        System.out.println("Enter 2nd operand:");
	        secondOperand = sc.nextInt();
	 
	        System.out.println("Enter operation type:");
	        operation = sc.next().charAt(0);
	 
	        switch (operation) {
	            case '*': {
	                System.out.printf("%d * %d = %d", firstOperand, secondOperand, firstOperand * secondOperand);
	                break;
	            }
	            case '/': {
	                System.out.printf("%d / %d = %d", firstOperand, secondOperand, firstOperand / secondOperand);
	                break;
	            }
	            case '+': {
	                System.out.printf("%d + %d = %d", firstOperand, secondOperand, firstOperand + secondOperand);
	                break;
	            }
	            case '-': {
	                System.out.printf("%d - %d = %d", firstOperand, secondOperand, firstOperand - secondOperand);
	                break;
	            }
	            default: {
	                System.out.println("Incorrect operation value passed! Calculation aborted!");
	            }
	        }
	    }
	}