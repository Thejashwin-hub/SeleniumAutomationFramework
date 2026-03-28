package tests;

import java.lang.reflect.Array;
import java.math.BigInteger;

import org.testng.annotations.Test;

public class Programs {

	@Test
	public void reverseNumber() {
		int num = 12765;
		int rev = 0;
		/*String num="125363";
		String rev = new StringBuilder(num).reverse().toString();
		*/
		while(num!=0) {
		int	rem = num % 10;
		rev = rev*10+rem;
		num=num/10;
		}
		System.out.println("Reverse number = "+ rev);
	}

	@Test
	public void palindrome() {
		int num = 1243321;
		int temp = num;
		int rev = 0;
		while(num!=0) {
			int rem = num%10;
			rev = rev * 10 + rem;
			num=num/10;
		}
		if (rev==temp) {
			System.out.println("palindrome number = "+ rev);
		}else {
			System.out.println("Not Palidrome number = "+ rev);
		}
	}
	@Test
	public void reverseString() {
		String name="Hello";
		String revName="";
		for(int i=name.length()-1;i>=0;i--) {
			revName=revName+name.charAt(i);			
		}
		System.out.println("Reversed string = " +  revName);
	}
	
	
	@Test
	public void reverseStringUsingStringBuilder() {
		String name="Hello";
		String revName=new StringBuilder(name).reverse().toString();
		
		System.out.println("Reversed string = " +  revName);
	}
	
	
	@Test
	public void reverseEntireSentence() {
		String name="Hello world";
		String revName=new StringBuilder(name).reverse().toString();
		
		System.out.println("Reversed string = " +  revName);
	}
	
	@Test
	public void reverseEachWord() {
		String name="Hello world";
		String[] words = name.split(" ");
		for (String word : words) {
			
			String revName=new StringBuilder(word).reverse().toString();

		
		System.out.print(revName + " ");
		}
	}
	@Test
	public void swapStringUsingThirdVariable() {
		String name1= "Hello";
		String name2= "World";
		System.out.println("Before swapping name1 = "+ name1);
		System.out.println("Before swapping name2 = "+ name2);
		//swapping
		String temp = name1;
		name1 = name2;
		name2 = temp;
		System.out.println("After swapping name1 = "+ name1);
		System.out.println("After swapping name2 = "+ name2);
		
	}
	
	
	@Test
	public void swapString() {
		
		String name1= "Hello";
		String name2= "World";
		System.out.println("Before swapping name1 = "+ name1);
		System.out.println("Before swapping name2 = "+ name2);
		
		name1 = name1+name2;
		name2 = name1.substring(0,name1.length()-name2.length());
		name1 = name1.substring(name2.length());
		
		System.out.println("After swapping name1 = "+ name1);
		System.out.println("After swapping name2 = "+ name2);
		
		
	}
	
	@Test
	public void swapNumbersUsingThirdVariable() {
		int num1= 10;
		int num2= 60;
		System.out.println("Before swapping num1 = "+ num1);
		System.out.println("Before swapping num2 = "+ num2);
		//swapping
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping num1 = "+ num1);
		System.out.println("After swapping num2 = "+ num2);
		
	}
	
	@Test
	public void swapNumbersWithoutUsingThirdVariable() {
		int num1= 64;
		int num2= 45;
		System.out.println("Before swapping num1 = "+ num1);
		System.out.println("Before swapping num2 = "+ num2);
		/*swapping using addition & substraction
		num1 = num1+ num2; //70
		num2 = num1- num2; //10
		num1 = num1- num2; //60*/
		/*//using multplication & division 
		num1 = num1*num2;
		num2 = num1/num2;
		num1 = num1/num2;*/
		//using xor (xor cancel same values)
		num1= num1^num2;
		num2= num1^num2;
		num1= num1^num2;
		
		System.out.println("After swapping num1 = "+ num1);
		System.out.println("After swapping num2 = "+ num2);
		
	}
	
	@Test
	//check if num is divisble by number between 2 to num-1
	public void primeNumber1() {
		int num = 6;
		boolean isPrime = true;
		
		if(num <=1) {
			isPrime=false;
		}else {
			for(int i=2; i<num; i++) {
				if(num%i == 0) {
					isPrime = false;
					break;
				}
				
			}
		}
		if(isPrime) {
			System.out.println(num + " is Prime number");
		}else {
			System.out.println(num+ " is not prime number");
		}
	}
	
	@Test
	//instead of checking till num-1, check till squareroot of num
	public void primeNumber2(){
		
		int num= 12;
		boolean isPrime = true;
		if(num <=1) {
			isPrime=false;
		}else {
			for(int i=2; i<= Math.sqrt(num); i++) {
				if(num%i == 0) {
					isPrime = false;
					break;
				}
				
			}
		}
		if(isPrime) {
			System.out.println(num + " is Prime number");
		}else {
			System.out.println(num+ " is not prime number");
		}
	}
	
	@Test
	public void factorialProgram1() {
		int num = 5;
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact * i;			
		}
		System.out.println("factorial of " + num + " is " + fact);
	}
	
	//factorial using Recursion
	
	public static int factorial(int n) {
		if(n==0||n==1)
			return 1;
		return n*factorial(n-1);
	}
	@Test
	public void factorialProgram2(){
		int n= 5;
		int fact = factorial(n);
		System.out.println("factorial of " + n + " is " + fact);
		
	}
	
	@Test
	//using BigInteger for large number
	public void factorialProgram3() {
		int num = 25;
		BigInteger fact = BigInteger.ONE;
		for(int i=1; i<=num; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));	
			
		}
		System.out.println(fact);
	}
	
}