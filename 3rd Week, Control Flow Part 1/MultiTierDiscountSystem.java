
/**
 *
 * @author HUAWEI
 */
public class MultiTierDiscountSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double magkano = 1000; //purchaseamount = magkano
        double bawas = 0; //discount = bawas
        
        if (magkano >= 1000) {
            bawas = 0.20;
        } else if (magkano >= 500) {
            bawas = 0.10;
        } else if (magkano >= 100) {
            bawas = 0.05;
        } else {
            bawas = 0;
        }
        
        double discountedPrice = magkano - (magkano * bawas);
        
        System.out.println("Purchase Amount: " + magkano);
        System.out.println("Discount Tier: " + (bawas * 100 +"%"));
        System.out.println("Final Discount Price: " + discountedPrice);
    }
    
}
