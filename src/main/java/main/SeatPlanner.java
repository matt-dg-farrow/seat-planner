package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SeatPlanner {

	List<String> initials = new ArrayList<String>();
	
	String[] initialArray = {"AM","AR","AT","AW","CA","CG","ER","ED","HH","JB","JK","JL","JG","LM","EC","LP","LC","LH","MF","NV","RR","TK","ZZ", "XX"};
			

			
	public void shuffle() {
		
		Collections.addAll(initials, initialArray);

		Collections.shuffle(initials);

		int rowCount = 2;
		System.out.println("Front");		
		System.out.println("Row 1:                               Window");
		for (int k = 0; k < initials.size(); k++) {

			
			System.out.print(initials.get(k) + "     ");
			
			if ((k+1)%6==0 && k<(initials.size()-1)) {
//				System.out.print("Window");
				System.out.println("\n" + "Row " + rowCount + ": ");
				rowCount++;
			}
			
		}
		System.out.print("\nBack");
	}
}
