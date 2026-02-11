package JOBSHEET2;
import java.util.Scanner;
public class Lecturer {
    public String name;
    public String email;
    public String course;
    public int code;

    public void getDisplayInfo() {
        System.out.println("Name        : " + name);
        System.out.println("Email       : " + email);
        System.out.println("Course      : " + course);
        System.out.println("Code        : " + code);
        System.out.println();
    }
    public void getDisplayLectureCourse(String nm, String cr) {
        System.out.println("Mata Kuliah yang diampu oleh dosen " + nm + " adalah " + cr);
        System.out.println();
    }
    public void setEditCourse(Scanner input) {
        System.out.print("Enter new course name: ");
        String newCourse = input.nextLine();
        this.course = newCourse;
    }
}
