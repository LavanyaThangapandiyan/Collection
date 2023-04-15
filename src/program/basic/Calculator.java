package program.basic;

import java.util.Scanner;

 class Calculator
{
 public double firstNumber;
 public double secondNumber;
 
 public double getFirstNumber()
 {
	return firstNumber; 
 }
 public double secondNumber()
 {
	return secondNumber;
	 
 }
 public void setFirstNumber(double fn)
 {
	 firstNumber=fn;
 }
 public void setsecondNumber(double sn )
 {
	 firstNumber=sn;
 }
 public double getAdditionResult()
 {
	double add= firstNumber+secondNumber;
 return add;	 
 }
 public double getSubtractionResult()
 {
	 double sub= secondNumber-firstNumber;
	 return sub; 
 }
 public double getMultiplicationResult()
 {
	 double mul= firstNumber*secondNumber;
	 return mul;  
 }
 public double getDivisionResult()
 {
	 if(secondNumber==0)
		 return 0;
	 double div= firstNumber/secondNumber;
	 return div; 
 }
}

