import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    List<Student> studentList;
    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() { //можно перебирать класс с помощью for each
        return new StudentGroupIterator(this);
    }
}
