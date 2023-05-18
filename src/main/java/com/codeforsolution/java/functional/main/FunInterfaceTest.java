package com.codeforsolution.java.functional.main;

import com.codeforsolution.java.functional.Bike;
import com.codeforsolution.java.functional.impl.BikeImpl;

public class FunInterfaceTest {

	public static void main(String[] args) {
			
		//Without functional interface and lambda
		
		BikeImpl bike = new BikeImpl();
		bike.pulsar();
		
		//Using functional interface and lambda
		
		Bike bikeFn = () -> System.out.println("This is functional interface call using lambda expression");
		bikeFn.pulsar();
		
	}

}
