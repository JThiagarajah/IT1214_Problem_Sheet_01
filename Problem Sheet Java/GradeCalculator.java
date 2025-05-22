class Student {
    private String name;
    private int exam1, exam2, exam3;

    public Student(String name, int exam1, int exam2, int exam3) {
        if (exam1 < 0 || exam1 > 100 || exam2 < 0 || exam2 > 100 || exam3 < 0 || exam3 > 100) {
            throw new IllegalArgumentException("Exam scores must be between 0 and 100.");
        }
        this.name = name;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.exam3 = exam3;
    }

    public String getName() { return name; }

    public double calculateAverage() {
        return (exam1 + exam2 + exam3) / 3.0;
    }
}

public class GradeCalculator {
    public static void main(String[] args) {
        try {
            Student s = new Student("John", 75, 110, 90);
            System.out.printf("Student: %s, Average: %.2f\n", s.getName(), s.calculateAverage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}