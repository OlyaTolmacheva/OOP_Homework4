import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    List<Student> studentList;
    int counter = 0;
    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.studentList;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size(); //если меньше - true, можем взять след.элемент
    }

    @Override
    public Student next() { //возвращает текущий элемент и увеличивает индекс на 1
        if (!hasNext())
            return null;
        return studentList.get(counter++);
    }

    @Override
    public void remove() { //удаляет текущий элемент
        if (hasNext())
            studentList.remove(--counter);
    }
}
