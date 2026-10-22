import java.util.Scanner;
/**
 *
 * @author HUAWEI
 */
public class SumUntilSentinelValue {

    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);

        int number;
        int total = 0;

        System.out.print("Enter a number (-1 to stop): ");
        number = sc.nextInt();

        while (number != -1) {
            total += number;

            System.out.print("Enter a number (-1 to stop): ");
            number = sc.nextInt();
        }

        System.out.println("Final Total: " + total);
    }
    
}
