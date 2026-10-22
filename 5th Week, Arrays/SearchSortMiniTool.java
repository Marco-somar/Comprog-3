import java.util.Arrays;
/**
 *
 * @author HUAWEI
 */
public class SearchSortMiniTool {

    public static void main(String[] args) {
         int[] scores = {96, 89, 95, 91, 84, 90, 76, 88};
        int target = 76;
        boolean found = false;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                System.out.println(target + " was found at index " + i);
                found = true;
                break;
                
            }
        }

        if (!found) {
            System.out.println(target + " was not found.");
        }

        // yung sortedscores na yung bahala sa pag copy pero in order yung given na scores 
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);
        System.out.println("-------------------------------------------------");
        System.out.println("Original Array: " + Arrays.toString(scores));
        System.out.println("Sorted Array: " + Arrays.toString(sortedScores));
    }
    
}
