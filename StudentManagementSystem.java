class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the valid range (15-21).");
        }
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name contains invalid characters. Only letters and spaces are allowed.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameNotValidException {
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name contains invalid characters. Only letters and spaces are allowed.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the valid range (15-21).");
        }
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "John Doe", 18, "Computer Science");
            System.out.println("Student 1 created successfully: " + student1.getName());

            Student student2 = new Student(2, "Jane@Doe", 20, "Biology");
            System.out.println("Student 2 created successfully: " + student2.getName());
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.err.println(e.getMessage());
        }

        try {
            Student student3 = new Student(3, "Tom123", 22, "Physics");
            System.out.println("Student 3 created successfully: " + student3.getName());
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.err.println(e.getMessage());
        }

        try {
            Student student4 = new Student(4, "Alice", 14, "Mathematics");
            System.out.println("Student 4 created successfully: " + student4.getName());
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.err.println(e.getMessage());
        }
    }
}