public class SelectionSort {
	//public class SelectionSort {
		 private int temp;

		/** Creates a new instance of SelectionSort */
	    public SelectionSort() {
	    }
	    
	    /* A simple SelectionSort algorithm
	     * pre-condition: An unsorted array
	     * post-condition: A sorted array
	     * inputs: An array
	     * outputs: An array
	     * special conditions:
	     */    
	    public int[] basicSelectionSort(int[] x) {
	        for (int i = 0; i < x.length; ++i) {
	            for (int j= 0; j < x.length; ++j) {
	            	if (i != j) {
	            		if (x[i] < x[j]) {
	            			temp = x[j];
	            			x[j] = x[i];
	            			x[i] = temp;
	                }
	            	}
	            } // end of inner for loop
	        } // end of outer for loop
	        return x;
	    } // end of basicSelectionSort method

	//}
}
