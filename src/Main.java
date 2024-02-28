import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(4, "AAA", "AAA", "AAA");
        Student student2 = new Student(2, "Aaa", "Aaa", "Aaa");
        Student student3 = new Student(3, "aaa", "aaa", "aaa");
        Student student4 = new Student(1, "baa", "baa", "baa");

        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);

        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);

        StudentGroupService service = new StudentGroupService(studentGroup);

        UserView<Student> view = new StudentView();
        view.sendOnConsole(service.getSortedStudentGroupByFIO());

        System.out.println();

        Teacher teacher1 = new Teacher(1, "Ivanov", "Ivan", "Ivanovich");
        Teacher teacher2 = new Teacher(2, "Semenov", "Semen", "Semenovich");
        Teacher teacher3 = new Teacher(3, "Borisov", "Boris", "Borisovich");

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);

        TeacherService service1 = new TeacherService(teacherList);

        UserView<Teacher> view1 = new TeacherView();
        view1.sendOnConsole(service1.getSortedTeacherByFIO());
    }
}