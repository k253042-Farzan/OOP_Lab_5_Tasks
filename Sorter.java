import java.util.Arrays;

public class ArraySorter {
    public static void main(String[] args) {

        String[] students = {"Saad", "Hasan", "Farzan", "Sana", "Ali"};

        Arrays.sort(students);

        System.out.println("Names after sorting:");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}