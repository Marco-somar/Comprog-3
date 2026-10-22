
/**
 *
 * @author HUAWEI
 */
public class ATMtransactionauthorizer {
 
    
    public static void main(String[] args) {
        
        String username = "admin";
        String correctUsername= "admin";
        
        int pin = 1234;
        int correctPin = 1234;
        
        double balance = 80000;
        double withdrawalAmount = 40000;
        
        String tier = "";
        double dailyLimit = 0;
        double feePercentage = 0;
        
        if(username.equals(correctUsername)) {
            if (pin == correctPin){
                System.out.println("Login Successfully");
                
                if (balance >= 100000) {
                    tier = "Platinum";
                    dailyLimit = 100000;
                }else if (balance >= 50000){
                    tier = "Gold";
                    dailyLimit = 50000;
                } else if (balance >= 25000) {
                    tier = "Silver";
                    dailyLimit = 25000;
                } else {
                    tier = "Bronze";
                    dailyLimit = 10000;
                }
                
                System.out.println("Account Tier:" + tier);
                
                switch (tier) {
                    case "Bronze":
                        feePercentage = 0.02;
                        break;
                    case "Silver":
                        feePercentage = 0.015;
                        break;
                    case "Gold":
                        feePercentage = 0.01;
                        break;
                    case "Platinum":
                        feePercentage = 0.005;
                        break;
                }
                
                double transactionFee = withdrawalAmount * feePercentage;
                double totalAmount = withdrawalAmount + transactionFee;
                
                System.out.println("Withdrawal Amount: " + withdrawalAmount);
                System.out.println("Transaction Feee:" + transactionFee);
                
                if (totalAmount <= balance) {
                    if (withdrawalAmount <= dailyLimit) {
                        balance = balance - totalAmount;
                        
                        System.out.println("Transaction: APPROVED");
                        System.out.println("Remaining Balance: " + balance);
                    } else {
                        System.out.println("Transaction: DENIED");
                        System.out.println("Reason: Withdrawal exceeds daily limit");
                    }
                } else {
                    System.out.println("Transaction: DENIED");
                    System.out.println("Reason: Insufficient balance");
                }
                
            } else {
                System.out.println("Login Failed: Incorrect PIN.");
            }
        }else {
            System.out.println("Login Failed: Incorrect Username");
        }
    }
    
}
