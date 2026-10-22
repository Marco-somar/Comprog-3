
/**
 *
 * @author HUAWEI
 */
public class FavoriteThingsArray {

    public static void main(String[] args) {
      String[] favorites = {"badminton", "doomscrolling", "Technology", "hanging out", "music/kareoke"};
        
        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }
        System.out.println("-----------------------");
        System.out.println("Total Favorites: " + favorites.length);
    }
    
}
