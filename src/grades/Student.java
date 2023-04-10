package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> studentGrades;

    public Student(String firstName, String lastName) {
        studentName = firstName + " " + lastName;
        studentGrades = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void addGrade(int grade) {
        studentGrades.add(grade);
    }

    public double getGradeAverage() {
        int average = 0;
        for (int i = 0; i <= studentGrades.size(); i++) {
            average += studentGrades.get(i);

        }
        return average/studentGrades.size();
    }
}
