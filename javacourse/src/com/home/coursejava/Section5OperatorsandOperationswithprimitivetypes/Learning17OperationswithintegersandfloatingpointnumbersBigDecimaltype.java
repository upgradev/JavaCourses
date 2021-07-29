package com.home.coursejava.Section5OperatorsandOperationswithprimitivetypes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Learning17OperationswithintegersandfloatingpointnumbersBigDecimaltype {

	public static void main(String[] args) {
		
		int i = 20;
		System.out.println(i / 3);
		System.out.println(i - (6 * 3));
		System.out.println((double)i / 3);
		
		BigDecimal ridefee = BigDecimal.valueOf(20).setScale(2);
		System.out.println(ridefee);
		BigDecimal amountOfPeople = BigDecimal.valueOf(3);
		BigDecimal chargePerPerson = ridefee.divide(amountOfPeople, RoundingMode.HALF_UP);
		System.out.println(amountOfPeople);
		System.out.println(chargePerPerson);
		
		double d = 3.1;
		double d2 = 1.21;
		
		System.out.println(d - d2);
		BigDecimal bd3 = BigDecimal.valueOf(3.1).setScale(2);
		BigDecimal bd4 = BigDecimal.valueOf(1.21).setScale(2);
		System.out.println(bd3.subtract(bd4));
		
	}
	
}
