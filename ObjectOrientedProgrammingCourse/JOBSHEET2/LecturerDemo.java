package JOBSHEET2;
import java.util.Scanner;
public class LecturerDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Lecturer lecturer1 = new Lecturer();
        lecturer1.name = "Alyfa";
        lecturer1.email = "alyfa@gmail.com";
        lecturer1.course = "PBO";
        lecturer1.code = 121;

        Lecturer lecturer2 = new Lecturer();
        lecturer2.name = "Zahra";
        lecturer2.email = "zahra@gmail.com";
        lecturer2.course = "Basis Data";
        lecturer2.code = 122;
        
        lecturer1.getDisplayInfo();
        lecturer1.setEditCourse(input);
        System.out.println();
        lecturer1.getDisplayLectureCourse(lecturer1.name, lecturer1.course);

        lecturer2.getDisplayInfo();
        lecturer2.setEditCourse(input);
        System.out.println();
        lecturer2.getDisplayLectureCourse(lecturer2.name, lecturer2.course);

        input.close();
    }
}
