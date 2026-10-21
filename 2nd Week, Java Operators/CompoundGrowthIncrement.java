
/**
 *
 * @author HUAWEI
 */
public class CompoundGrowthIncrementTracker {
    public static void main(String[] args) {
        double balance = 2500;
        
        System.out.println("Initial Blance" + balance);
        balance += 400;
        
        System.out.println("After adding 400: " + balance);
        
        balance *= 1.30;
        System.out.println("After 30% growth:" + balance);
        
        balance += 300;
        System.out.println("After adding 300:" + balance);
        
        int count = 5;
        
        System.out.println("\nPostfix Increment");
        System.out.println(count++);
        System.out.println(count);
        
        System.out.println("\nPrefix Increment");
        System.out.println(count++);
        System.out.println(count);
    }
    
}
