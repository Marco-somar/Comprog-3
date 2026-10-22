
/**
 *
 * @author HUAWEI
 */
public class PatternGeneratorWithEarlyExit {

    public static void main(String[] args) {
       
         int size = 10;

        for (int x = 1; x <= size; x++) {

            for (int y = 1; y <= x; y++) {

                if (y == 9) {
                    break; // yung "break" mag s-stops ng inner loop pag yung "j" naabot na yung "9"
                }

                if (y == 1) {
                    continue; //mag ccontinue malagpasan yung pag print ng number "2"
                }
                
                System.out.print("o ");
            }
            
            System.out.println(); //tumutulong para mag move sa susunod na linya (move to next line)
        }    
    }
    
}
