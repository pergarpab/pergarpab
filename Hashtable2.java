import java.util.*;

class Hashtab {

static int[][] totalSales(int[][] data) {
	Hashtable<Integer, Integer> hash =
	new Hashtable<Integer, Integer>();
	
	for (int i = 0; i < data.length; i++) {
		int productId = data[i][0];
		int quantity = data[i][1];
		if (hash.containsKey(productId)) {
			quantity = quantity + hash.get(productId);
		}
		hash.put(productId, quantity);
	}
	
	int[][] totals = new int[hash.keySet().size()][2];
	int index = 0;
	for (int key : hash.keySet()) {
		totals[index][0] = key;
		totals[index][1] = hash.get(key);
		index = index + 1;
	}
	return totals;
}

public static void main (String[] args) {

		int[][] big = {{211,4},{262,3},{211,5},{216,6}};
        int[][] sol = totalSales(big);
				
		System.out.println(Arrays.deepToString(sol));
	}
}