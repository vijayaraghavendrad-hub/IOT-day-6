package IOT6;

public class binary_ex2 {

	    public static int binarySearch(String[] arr, String target) {

	        int left = 0;
	        int right = arr.length - 1;

	        while (left <= right) {

	            int mid = (left + right) / 2;

	            System.out.println("Checking: " + arr[mid]);

	            if (arr[mid].equals(target)) {
	                return mid;

	            } else if (target.compareTo(arr[mid]) > 0) {
	                left = mid + 1;

	            } else {
	                right = mid - 1;
	            }
	        }

	        return -1;
	    }
	    public static void main(String[] args) {

	        String[] names = {
	            "yashwanth",
	            "yashwanth sk",
	            "vaishak",
	            "anand",
	            "vijay",
	            "pawar",
	            "Neha",
	            "par",
	            "Rohan",
	            "Varun"
	        };
	        String target = "vijay";

	        int result = binarySearch(names, target);

	        if (result != -1) {
	            System.out.println("Name found at index: " + result);
	        } else {
	            System.out.println("Name not found");
	        }
	    }

}