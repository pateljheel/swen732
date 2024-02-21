import java.util.List;

public class LibraryAdmin extends User{
    public LibraryAdmin(String id) {
        this.setId(id);
    }

    public List<Resource> getBorrowedResources (LibraryVisitor visitor) {

        return visitor.getBorrowedResources(this);
    }

    public List<Resource> getBorrowableResources (LibraryVisitor visitor) {

        return visitor.getLibraryAdminBorrowableResources();
    }
}
