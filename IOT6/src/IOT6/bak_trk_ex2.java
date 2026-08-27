package IOT6;

public class bak_trk_ex2 {

    public static void main(String[] args) {

        String correctPassword = "231";
        String[] passwords = {"123", "132", "213", "231"};

        for (String password : passwords) {

            System.out.println("Trying: " + password);

            if (password.equals(correctPassword)) {
                System.out.println("Password found: " + password);
                break;
            }
            else {
            System.out.println("Wrong password. Try another.");
        }
    }
}
} 