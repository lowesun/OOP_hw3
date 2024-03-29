import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EducationGroup implements IGroup, Serializable {
    private int groupNo;
    private String name;
    private Teacher teacher;
    private List<Student> students;


    public EducationGroup(int groupNo, String name, Teacher teacher, List<Student> students) {
        this.groupNo = groupNo;
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public EducationGroup(int groupNo, String name) {
        this(groupNo, name, null, new ArrayList<>());
    }


    public EducationGroup(int groupNo) {
        this(groupNo, "");
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }



    public void addStudent(Student student){
        students.add(student);
    }

    public void deleteStudent(Student student){
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void deleteStudent(int position){
        students.remove(position);
    }

    @Override
    public String toString() {
        return "Группа №" + groupNo +
                ", название: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EducationGroup that = (EducationGroup) o;
        return groupNo == that.groupNo && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupNo, name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getGroupNo() {
        return this.groupNo;
    }

    @Override
    public void setGroupNo(int groupNo) {
        this.groupNo = groupNo;
    }

}