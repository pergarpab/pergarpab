import java.util.*;

public class Hashtab {

static boolean isSubset(String[] bigger, String[] smaller) {
	Hashtable<String, Boolean> hash =
		new Hashtable<String, Boolean>();
	
	/*Record all elements in the bigger list*/	
	for (String b : bigger) {
		hash.put(b, true);
	}
	
	/*Check if the bigger hashtable contains all the strings*/
	for (String s : smaller) {
		if (!hash.containsKey(s) || hash.get(s) != true) {
			return false;
		}
	}
	return true;
}

public static void main (String[] args) {

		String[] big = {"abc","def","ghi"};
		String[] small = {"ghi","jkl"};
				
		System.out.println(isSubset(big, small));
	}
}