package program5;
// Author: Murtaza Meerza
import stdlib.*;

public class TestP5Hash {

	public static void main(String[] args) {
		StdIn.fromFile("data/DPUStudents.txt");
		String[] ids = StdIn.readAllStrings();
		P5HashST<String, Boolean> DPUStudents = new P5HashST<>(46021);
		// Size of the Hash Table == > 23,000 * 2 = 46,000 ==> next prime number is 46,021
		for (String student: ids) {
			DPUStudents.put(student, true);
		}
		StdOut.println("The number of puts is: "+ DPUStudents.pCounter());
		StdOut.println("The number of collisions is: "+ DPUStudents.countColli());

	}

}

