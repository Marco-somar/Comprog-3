
/**
 *
 * @author HUAWEI
 */
public class ClassRankingSystem {

    public static void main(String[] args) {
        String[] names = {"Mendoza", "Concordia", "Gabriz", "Figueroa", "Espela"};
        int[][] quizData = {
            {96, 93, 92, 96},
            {88, 92, 93, 94},
            {90, 85, 95, 89},
            {94, 96, 91, 94},
            {97, 92, 90, 95}
        };

        Student[] students = new Student[names.length];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getAverage() < students[j + 1].getAverage()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("CLASS LEADERBOARD");
        System.out.println("-------------------------------------");
        System.out.printf("%-10s %-14s %-10s%n", "Rank", "Name", "Average");
        System.out.println("-------------------------------------");

        int currentRank = 1;
        double epsilon = 0.00001;

        for (int i = 0; i < students.length; i++) {
            if (i > 0 && Math.abs(students[i].getAverage() - students[i - 1].getAverage()) > epsilon) {
                currentRank = i + 1;
            }
            System.out.printf("%-10d %-14s %-10.2f%n",
                    currentRank, students[i].getName(), students[i].getAverage());
        }
        System.out.println("-------------------------------------");

        String searchName = "Mendoza";
        int studentRank = findRank(students, searchName);

        if (studentRank != -1) {
            System.out.println(searchName + "'s rank: " + studentRank);
        } else {
            System.out.println(searchName + " was not found.");
        }
    }

    public static int findRank(Student[] students, String searchName) {
        int currentRank = 1;
        double epsilon = 0.00001;
        
        for (int i = 0; i < students.length; i++) {
            if (i > 0 && Math.abs(students[i].getAverage() - students[i - 1].getAverage()) > epsilon) {
                currentRank = i + 1;
            }
            if (students[i].getName().equalsIgnoreCase(searchName)) {
                return currentRank;
            }
        }
        return -1;
    }
    
}
