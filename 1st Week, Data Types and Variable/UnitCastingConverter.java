
/**
 *
 * @author HUAWEI
 */
public class UnitCastingConverter {
    
    public static void main(String[] args) {
        double centimeters = 234.5;
        
        int meters = (int) (centimeters / 100);
        double remainingCentimeters = centimeters - (meters * 100);
        
        System.out.println("Unit Casting Converter");
        System.out.println("Total Centimeters: " + centimeters);
        System.out.println("Whole meters: " + meters);
        System.out.println("Remaining Centimeters: " + remainingCentimeters);
        
        
        int number = 35;
        double windenedNumber = number;
        
        //nasa "double" naka store lahat ng int value kaya di na kaylangan mag cast 
        System.out.println("\nImplict Widening:");
        System.out.println("Integer: " + number);
        System.out.println("Double: " + windenedNumber);
        
        double decimalNumber = 12.30;
        int narrowedNumber = (int) decimalNumber;
        
        //sa Decimal yung .30 sa double decimalNumber mawawala kung gagawin int ang double 
        System.out.println("\nExplicit Narrowing:");
        System.out.println("Double: " + decimalNumber);
        System.out.println("Integer: " + narrowedNumber);
    }
    
}
