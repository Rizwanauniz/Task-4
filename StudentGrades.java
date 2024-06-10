import java.util.HashMap;

public class StudentGrades {
    private HashMap<String, Integer> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

     public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
    }

   public void removeStudent(String name) {
        studentGrades.remove(name);
    }

    public void displayGrade(String name) {
        Integer grade = studentGrades.get(name);
        if (grade != null) {
            System.out.println(name + "'s grade: " + grade);
        } else {
            System.out.println("No grade found for " + name);
        }
    }

    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();
        grades.addStudent("Alice", 85);
        grades.addStudent("Bob", 90);

        grades.displayGrade("Alice");
        grades.displayGrade("Bob");

        grades.removeStudent("Bob");
        grades.displayGrade("Bob");
    }
}