
/**
 *
 * @author HUAWEI
 */
public class PrecedencePuzzleSolver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 7;
        int b = 2;
        
        //Predicted: false
        System.out.println((a + b*2) > 10 && a < b + 3);
        
        //Predicted:12
        int c = 5;
        System.out.println(++c + 2*3);
        
        //Predicted false
        int d = 4;
        System.out.println(d++ > 4 || d*2 == 10);
    }
    
}
