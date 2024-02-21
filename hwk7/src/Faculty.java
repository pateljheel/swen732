import java.util.List;

public class Faculty extends User{
    private String department;

    public Faculty(String id, String department) {
        this.setId(id);
        this.setDepartment(department);
    }

    public List<Resource> getBorrowedResources (LibraryVisitor visitor) {

        return visitor.getBorrowedResources(this);
    }

    public List<Resource> getBorrowableResources (LibraryVisitor visitor) {

        return visitor.getFacultyBorrowableResources();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
