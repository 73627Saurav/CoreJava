package prim_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Objective -- Accept no of data samples(of type double) from User(using scanner)
Create suitable array & display it using for-loop , to confirm default values.
Display name of the loaded class for this array.

Accept data from User(scanner) & store it in the array.
Display array data using  for loop.

Display array data using for-each loop

 */

// TYPES OF REFERENCES - class type ref, array type ref, interface type ref

public class Test1 {

	public static void main(String[] args) {
		// create a scanner wrapping stdin
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of double values to store?");
		double[] data;
		// data : ref type of a var : array type of ref pointing to an array object on heap that can contain double values
		// mem allocated on stack
		// no object is created yet

		data = new double[sc.nextInt()]; // array type of object
		// name of the loaded class on method area : [D ,
		// single array obj will be created on the heap

		// display it using for-loop
		System.out.println("default contents of array via for loop");
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i] + " ");
		// display via for-each

		System.out.println("\ndefault contents of array via for-each loop");
		for (double d : data)
			// for (typeOfdata d : nameOfRef)
			// makes copy of data into loop variable 'd' 
			// thus, works on a copy !
			// d=data[0],d=data[1]......d=data[data.length-1] 
			System.out.print(d + " ");

		System.out.println("\ncls loaded for the array " + data.getClass().getName());
		
		/*
		 * accept data from User(scanner) & store it in the array. Display array data
		 * using for each loop
		 */
		for (int i = 0; i < data.length; i++) {
			System.out.println("Enter array data ");
			data[i] = sc.nextDouble();
		}
		
		System.out.println("populated contents of array via for-each loop");
		for (double d : data)// d=data[0],d=data[1]......d=data[data.length-1] : works on a copy !
			System.out.print(d + " ");
		
		System.out.println("\nArray contents via Arrays.toString");
		System.out.println(Arrays.toString(data));

		sc.close();

	}

}
