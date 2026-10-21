
/**
 *
 * @author HUAWEI
 */
public class TypeSafeShoppingCalculator {

    public static void main(String[] args) {
        int quan = 5;
        double unitp = 60.50;
        String sname = "ABC Store";
        
        double total = quan * unitp;
        //yung totalcost hindi pwedeng maging "int" since meron nmn siyang decimal value
        
        System.out.println("Shopping Summary");
        System.out.println("Store Name: " + sname);
        System.out.println("Quantity: " + quan);
        System.out.println("Unit Price: " + unitp);
        System.out.println("Total Cost: " + total);
    }
    
}
