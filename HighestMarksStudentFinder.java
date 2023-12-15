public class HighestMarksStudentFinder {

    public static void main(String[] args) {
        String[] studentsInfo = {
            "1, Rajesh, 69" ,
            "2, Dinesh, 45" ,
            "3, Trupti, 72" ,
            "4, Yogesh, 60" ,
            "5, Bhavana, 50" ,
            "6, Bhavesh, 63"
        };

        String highestMarksStudent = findHighestMarksStudent(studentsInfo);

        System.out.println("Student with the highest marks: " + highestMarksStudent);
    }

    public static String findHighestMarksStudent(String[] studentsInfo) {
        int maxMarks = Integer.MIN_VALUE;
        String highestMarksStudent = "";

        for (String student : studentsInfo) {
            String[] values = student.split(", ");
            int marks = Integer.parseInt(values[2]);

            if (marks > maxMarks) {
                maxMarks = marks;
                highestMarksStudent = values[1];
            }
        }

        return highestMarksStudent;
    }
}
