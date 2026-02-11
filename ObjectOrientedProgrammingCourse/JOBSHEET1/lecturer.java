package JOBSHEET1;
public class lecturer {
    public static void main(String[] args) {
        String name, name2, name3, name4, name5, name6, name7, name8, name9, name10;
        String email, email2, email3, email4, email5, email6, email7, email8, email9, email10;
        String course, course2, course3, course4, course5, course6, course7, course8, course9, course10;
        int code, code2, code3, code4, code5, code6, code7, code8, code9, code10;

        name = "Alyfa";
        email = "alyfa@gmail.com";
        course = "PBO";
        code = 121;

        name2 = "Zahra";
        email2 = "zahra@gmail.com";
        course2 = "PBO Practicum";
        code2 = 122;

        name3 = "Anindya";
        email3 = "anindya@gmail.com";
        course3 = "Basis Data";
        code3 = 123;

        name4 = "Naura";
        email4 = "naura@gmail.com";
        course4 = "Basis Data Lanjut";
        code4 = 124;

        name5 = "Aiska";
        email5 = "Aiska@gmail.com";
        course5 = "Pemrograman Web";
        code5 = 125;

        name6 = "Ocha";
        email6 = "ocha@gmail.com";
        course6 = "Pemrograman Mobile";
        code6 = 126;

        name7 = "Amalia";
        email7 = "amalia@gmail.com";
        course7 = "Jaringan Komputer";
        code7 = 127;

        name8 = "Nafisa";
        email8 = "nafisa@gmail.com";
        course8 = "Sistem Operasi";
        code8 = 128;

        name9 = "Lovie";
        email9 = "lovie@gmail.com";
        course9 = "Kecerdasan Buatan";
        code9 = 129;

        name10 = "Ailsa";
        email10 = "ailsa@gmail.com";
        course10 = "Statistika";
        code10 = 120;
        
        System.out.println();
        displayLecture(name, email, course, code);
        course = editCourse(course, "PBO Lanjutan");
        displayLecttureCourse(name, course);

        displayLecture(name2, email2, course2, code2);
        course2 = editCourse(course2, "PBO Praktikum Lanjutan");
        displayLecttureCourse(name2, course2);

        displayLecture(name3, email3, course3, code3);
        course3 = editCourse(course3, "Basis Data Lanjutan");
        displayLecttureCourse(name3, course3);

        displayLecture(name4, email4, course4, code4);
        course4 = editCourse(course4, "Basis Data Expert");
        displayLecttureCourse(name4, course4);

        displayLecture(name5, email5, course5, code5);
        course5 = editCourse(course5, "Pemrograman Web Lanjutan");
        displayLecttureCourse(name5, course5);

        displayLecture(name6, email6, course6, code6);
        course6 = editCourse(course6, "Pemrograman Mobile Expert");
        displayLecttureCourse(name6, course6);

        displayLecture(name7, email7, course7, code7);
        course7 = editCourse(course7, "Jaringan Komputer Lanjutan");
        displayLecttureCourse(name7, course7);

        displayLecture(name8, email8, course8, code8);
        course8 = editCourse(course8, "Sistem Operasi Expert");
        displayLecttureCourse(name8, course8);

        displayLecture(name9, email9, course9, code9);
        course9 = editCourse(course9, "Kecerdasan Buatan Lanjutan");
        displayLecttureCourse(name9, course9);

        displayLecture(name10, email10, course10, code10);
        course10 = editCourse(course10, "Statistika Lanjutan");
        displayLecttureCourse(name10, course10);
        
    }

    public static void displayLecture(String nm, String em, String cr, int cd) {
        System.out.println();
        System.out.println("Nama Dosen  : " + nm);
        System.out.println("Email Dosen : " + em);
        System.out.println("Mata Kuliah : " + cr);
        System.out.println("Kode Dosen  : " + cd);
        System.out.println();

    }

    public static void displayLecttureCourse(String nm, String cr) {
        System.out.println("Mata Kuliah yang diampu oleh dosen " + nm + " adalah " + cr);
    }

    public static String editCourse(String oldCourse, String newCourse) {
        return newCourse; 
    }
}
