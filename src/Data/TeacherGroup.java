package Data;

import java.util.List;

public class TeacherGroup implements Iterable<Teacher>{
    private List<Teacher> teachers;
    private Teacher teacher;


    public TeacherGroup(Teacher teacher, List<Teacher> students) {
        this.teacher = teacher;
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "Teachers=" + teacher +
                '}';
    }

    @Override
    public TeacherGroupIterator iterator() {
        return new TeacherGroupIterator(this);
    }
}