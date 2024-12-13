public class Main {

    public static void main(String[] args) {
        Student[] students = {
            new Student("Алексей", 20, "Информатика"),
            new Student("Мария", 22, "Филология"),
            new Student("Иван", 21, "Математика"),
            new Student("Елена", 23, "Экономика")
        };


        Student oldestStudent = findOldestStudent(students);

        System.out.println("Самый старший студент:");
        oldestStudent.displayInfo();
    }

    public static Student findOldestStudent(Student[] students) {
        Student oldest = students[0];
        for (Student student : students) {
            if (student.age > oldest.age) {
                oldest = student;
            }
        }
        return oldest;
    }
}

class Student {

    String name;
    int age;
    String discipline;

    public Student(String name, int age, String discipline) {
        this.name = name;
        this.age = age;
        this.discipline = discipline;
    }

    void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Дисциплина: " + discipline);
    }
}
