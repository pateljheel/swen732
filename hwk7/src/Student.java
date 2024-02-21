import java.util.List;

public class Student extends User {
    private StudentType studentType;
    private String major;

    public Student(String id, StudentType studentType, String major) {
        this.setId(id);
        this.setStudentType(studentType);
        this.setMajor(major);
    }

    public List<Resource> getBorrowedResources (LibraryVisitor visitor) {

        return visitor.getBorrowedResources(this);
    }

    public List<Resource> getBorrowableResources (LibraryVisitor visitor) {

        return visitor.getStudentBorrowableResources();
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public void setStudentType(StudentType studentType) {
        this.studentType = studentType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
