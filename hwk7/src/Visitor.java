import java.util.List;

public interface Visitor {
    public List<Resource> getBorrowedResources (User borrower);

    public List<Resource> getStudentBorrowableResources ();

    public List<Resource> getFacultyBorrowableResources ();

    public List<Resource> getLibraryAdminBorrowableResources ();
}
