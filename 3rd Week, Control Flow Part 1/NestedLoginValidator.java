
/**
 *
 * @author HUAWEI
 */
public class NestedLoginValidator {

    public static void main(String[] args) {
        String username = "Admin";
        String password = "1234";
        boolean accountLocked = false;
        
        if (username.equals("Admin")) {
            if(password.equals("1234")) {
                if (!accountLocked) {
                    System.out.println("Login Successfully");
                } else {
                    System.out.println("Login Failed: Account is locked."); 
                }
            } else {
                System.out.println("Login Failed: Incorrect Password."); 
            }
        } else {
            System.out.println("Login Failed: Incorrect Username."); 
        }
    }
    
}
