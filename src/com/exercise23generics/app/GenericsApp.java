package com.exercise23generics.app;

import com.exercise23generics.model.Resta;
import com.exercise23generics.model.Suma;

public class GenericsApp {

	public static void main(String[] args) 
	{
		//object declaration
		Suma<Integer,Integer,String> gen = new Suma<Integer,Integer,String>(5);
		Suma<String,Integer,String> gen2 = new Suma<String,Integer,String>("Hello from generic class");
		Resta<String,Double> gen3Resta = new Resta<String,Double>();
		Multi multi = new Multi();

		//show suma 
		System.out.println(gen.getT());
		System.out.println(gen2.getT());
		
		//initialize resta
		gen3Resta.setK("Hello from value k");
		gen3Resta.setV(3.89);
		
		//show
		System.out.println(gen3Resta.toString());
		System.out.println("Generic Method: \n" +multi.showDataType(67.98));
		System.out.println(multi.SumaNumeros(3, 3));
		
	}

}
