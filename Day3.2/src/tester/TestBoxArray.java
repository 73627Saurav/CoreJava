package tester;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Add Box class into "com.app.core"
Create a tester class  : TestBoxArray : "com.app.tester"

Objective : Ask user(client) , how many boxes to make ?
Accept Box dims 

Store these details suitably.
1. Display using single for-each loop, box dims n volume
 */
import com.app.core.Box;

public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many boxes to make?");
		
		//create an array to hold Box type of reference
		Box[] boxes;// boxes : array type of a ref ---> an array object which can hold Box type refs.
		boxes=new Box[sc.nextInt()];
		// how many objs? 1 ; Box[] : cls name: [Lcom.app.core.Box
		// first Box[] class get loaded into method area
		// No of slots on heap : sc.nextInt() : starting from 0,1,2,... Arrays.length-1.
		// default initialized value for Array elements will be 'null'
		
		System.out.println("loaded cls name for array : "+boxes.getClass().getName());
		System.out.println("Contents "+Arrays.toString(boxes));
		
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter Box dims w d h");
			boxes[i]=
					new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()); 
					// this box object will be created separately on heap but not within the array
		}
		
		//Display using single for-each loop, box dims n volume
		for(Box b : boxes)//b=boxes[0],b=boxes[1]
		{
			System.out.println(b.getBoxDetails()+" volume "+b.getBoxVolume());			
		}
		
		System.out.println("Contents "+Arrays.toString(boxes));
		//we will get hashcode for each reference as toString is not overridden in Box class
		sc.close();

	}

}
