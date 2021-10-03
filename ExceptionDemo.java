class ExceptionDemo{
	public static void main(String args []){
        
	try {

	int a = 20;
	int b = 0; // int b = 2;

	System.out.println("before the Execution...");
	System.out.println("The Answer is : " + a/b);
	System.out.println("After the Execution..");
	}

	catch(ArithmeticException e){
	
	System.out.println("Math Error Occured! Try Again...!!!");
	}

	System.out.println("After all... The Rest Of the Code...");
 }
}