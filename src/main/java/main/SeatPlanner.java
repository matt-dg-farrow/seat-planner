package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeatPlanner {

	List<String> initials = new ArrayList<String>();

	public void shuffle(String... allInitials) {

		Collections.addAll(initials, allInitials);

		Collections.shuffle(initials);

		int rowCount = 2;
		System.out.println("Front");
		System.out.println("Row 1:                                Window");
		for (int k = 0; k < initials.size(); k++) {

			System.out.print(initials.get(k) + "     ");

			if ((k + 1) % 6 == 0 && k < (initials.size() - 1)) {
				System.out.println("\n" + "Row " + rowCount + ": ");
				rowCount++;
			}

		}
		System.out.print("\nBack");
	}
}
