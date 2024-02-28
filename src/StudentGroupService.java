import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }
    public List<Student> getSortedStudentGroup() {
        List<Student> studentList = new ArrayList<>(studentGroup.studentList); // <- список, из которого будет создаваться новый отсортированный список
        Collections.sort(studentList);
        return studentList;
    }
    public List<Student> getSortedStudentGroupByFIO() {
        List<Student> studentList = new ArrayList<>(studentGroup.studentList);
        studentList.sort(new UserComparator<Student>());
        //или Collections.sort(studentList, new StudentComparator());
        return studentList;
    }
}
