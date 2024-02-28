import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    List<Teacher> teacherList;

    public TeacherService(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public List<Teacher> getSortedTeacherByFIO() {
        List<Teacher> sortedTeacherList = new ArrayList<>(this.teacherList);
        sortedTeacherList.sort(new UserComparator<Teacher>());
        return sortedTeacherList;
    }
}
