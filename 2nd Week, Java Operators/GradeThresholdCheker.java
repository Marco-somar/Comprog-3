
/**
 *
 * @author HUAWEI
 */
public class GradeThresholdCheker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double average = 97;
        int absences = 3;
        
        boolean passed = (average >= 75 && absences <= 3) || (average >= 90);
                
        System.out.println("------Grade Threshold Checker------");
        System.out.println("Average Grade: " + average);
        System.out.println("Number of Abscenes: " + absences);
        
        System.out.println("Result: " + (passed ? "PASS" : "FAIL"));
        
        System.out.print("Reasoning: ");
        if (average >= 90) {
            System.out.println("Excelent");
        } else if (average >= 75 && absences <= 3) {
            System.out.println("Passed");
        } else {
            System.out.println("Fail");
        }
    }
    
}
