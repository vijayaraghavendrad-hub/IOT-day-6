package IOT6;
	public class binary_ex5 {

	    public static void main(String[] args) {

	        String[] arr = {"Aman", "Aman", "Aman", "Bob", "Bob",
	                        "Rahul", "Rahul", "Rahul"};

	        String target = "Rahul";

	        int first = -1;
	        int last = -1;

	        int start = 0;
	        int end = arr.length - 1;

	        // Find first occurrence
	        while (start <= end) {

	            int mid = (start + end) / 2;

	            if (arr[mid].equals(target)) {
	                first = mid;
	                end = mid - 1;
	            }
	            else if (arr[mid].compareTo(target) < 0) {
	                start = mid + 1;
	            }
	            else {
	                end = mid - 1;
	            }
	        }

	        start = 0;
	        end = arr.length - 1;

	        // Find last occurrence
	        while (start <= end) {

	            int mid = (start + end) / 2;

	            if (arr[mid].equals(target)) {
	                last = mid;
	                start = mid + 1;
	            }
	            else if (arr[mid].compareTo(target) < 0) {
	                start = mid + 1;
	            }
	            else {
	                end = mid - 1;
	            }
	        }

	        System.out.println("First = " + first);
	        System.out.println("Last = " + last);
	    }
	}

