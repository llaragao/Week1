package Week1.Variables;


public class YourSchedule {

    public static void main(String[] args) {

        String course1 = "English III";
        String course2 = "Precalculus";
        String course3 = "Music Theory";
        String course4 = "Biotechnology";
        String course5 = "Principles of Technology I";
        String course6 = "Latin II";
        String course7 = "AP US History";
        String course8 = "Business Computer Infomation Systems";
        String teacher1 = "Ms. Lapan";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = "Ms. Garcia";
        String teacher6 = "Mrs. Barnett";
        String teacher7 = "Ms. Johannessen";
        String teacher8 = "Mr. James";

        System.out.println("+------------------------------------------------------------+");

        System.out.println(String.format("|1| %-36s | %-15s |", course1, teacher1));
        System.out.println(String.format("|2| %-36s | %-15s |", course2, teacher2));
        System.out.println(String.format("|3| %-36s | %-15s |", course3, teacher3));
        System.out.println(String.format("|4| %-36s | %-15s |", course4, teacher4));
        System.out.println(String.format("|5| %-36s | %-15s |", course5, teacher5));
        System.out.println(String.format("|6| %-36s | %-15s |", course6, teacher6));
        System.out.println(String.format("|7| %-36s | %-15s |", course7, teacher7));
        System.out.println(String.format("|8| %-36s | %-15s |", course8, teacher8));

        System.out.println("+------------------------------------------------------------+");

        System.out.println("+----------------------------------------------------------+");
        String[] courses = {course1, course2, course3, course4, course5, course6, course7, course8};
        String[] teachers = {teacher1, teacher2, teacher3, teacher4, teacher5, teacher6, teacher7, teacher8};
        for(int i = 0; i < courses.length; i++) {
            System.out.println(String.format("|%d| %36s | %-15s |", i+1, courses[i], teachers[i]));
            System.out.println("+----------------------------------------------------------+");
        }

    }
}
