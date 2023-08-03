package com.met.finlakeyword;

public class FinalVariable {

	/*final variable must be initialized during declaration*/

	final float SALARY=6700.89f;
	void print()
	{
		/*we cannot change the value of final variable */
	    //SALARY=1981.45f
		
		System.out.println("Salary is :" + SALARY);
	}
}
