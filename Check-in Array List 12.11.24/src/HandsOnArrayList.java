import java.util.Collections;
import java.util.ArrayList;

public class HandsOnArrayList {
        ArrayList<String> students = new ArrayList<>();
        public void arrayList() {
            students.add("Mia");
            students.add("Michael");
            students.add("Lily");
            students.add("Lana");
            students.add("Charlotte");
            students.add("Jeremiah");

            System.out.println("Student List: " + students);

            students.remove("Lana");
            System.out.println("One student removed list: " + students);

            students.add("Lana");

            Collections.sort(students);
            System.out.println("Sorted Student List: " + students);

        }
    }
