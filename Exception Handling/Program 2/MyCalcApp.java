/* 2) define your exception class by name "MyArithException"
(MyArithException.java)
define class "Calculator"   (Calculator.java)
In this class define a function,which will accept an int and return double of it.
e.g int caldouble(int)
This function will check an int which is passed to it
It will throw exception if 0 is passed or negative passed
in case of 0 caller of this method should get error message
"Zero not allowed" 
in case of negative caller of this method should get error message
"negative not allowed"
In case of positive value it should simply return the double value.

Now define class "MyCalcApp" (MyCalcApp.java)
In this class you accept a number from user and pass that no. to
caldouble() method which is mentioned above.
 */

package Omkar;

import java.io.InputStream;
import java.util.Scanner;

public class MyCalcApp {
	
	public static void main(String[] args) {
	Cal c = new Cal();
	int k=1;
	Scanner sc= new Scanner(System.in);
	k= sc.nextInt();
	
	try {
			c.caldouble(k);
	} 
	catch (MyArithException e) {
		// TODO Auto-generated catch block
		e.getMessage();
		e.printStackTrace();
		//System.out.println(e);
	}
	
	}
}
