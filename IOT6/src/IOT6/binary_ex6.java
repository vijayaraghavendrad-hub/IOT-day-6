package IOT6;

public class binary_ex6 {

    public static void main(String[] args) {

        String[] names = {"vijay", "vaishak", "david", "rahul", "varun"};

        String target = "ishani";

        int start = 0;
        int end = names.length - 1;

        String floor = "None";
        String ceil = "None";

        while (start <= end) {

            int mid = (start + end) / 2;

            if (names[mid].equals(target)) {
                floor = names[mid];
                ceil = names[mid];
                break;
            }

            else if (names[mid].compareTo(target) < 0) {
                floor = names[mid];
                start = mid + 1;
            }

            else {
                ceil = names[mid];
                end = mid - 1;
            }
        }

        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);
    }
}