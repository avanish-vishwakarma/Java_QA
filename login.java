
public class login {

    public static void main(String[] args) {
        String username = "admin";
        String password = "password";

        if (username.equals("admin") && password.equals("password")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
