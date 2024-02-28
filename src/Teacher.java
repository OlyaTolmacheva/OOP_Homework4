import java.util.List;

public class Teacher extends User implements Comparable<Teacher> {
    private Integer teacherId;
    List<Teacher> teacherList;
    public Teacher(Integer teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }
    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        if (teacherId > o.teacherId)
            return 1;
        if (teacherId < o.teacherId)
            return -1;
        return 0;
    }
}
