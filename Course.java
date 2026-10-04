package exercise;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[4];
        numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] newStudents = new String[students.length * 2];

            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }

            students = newStudents;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {

                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                break;
            }
        }
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}

class test2 {
    public static void main(String[] args) {

        Course course1 = new Course("Java");

        course1.addStudent("ayan");
        course1.addStudent("ceyni");
        course1.addStudent("surer");

        System.out.println(course1.getCourseName());
        System.out.println(course1.getNumberOfStudents());

        course1.dropStudent("ayan");

        System.out.println(course1.getNumberOfStudents());

        String[] students = course1.getStudents();

        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }
    }
}