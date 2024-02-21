import java.util.ArrayList;
import java.util.List;

/**
 * This is the Visitor class which implements the Visitor interface
 */
public class LibraryVisitor implements Visitor {
    private Library library;

    /**
     * Constructor expects a Library object which hold the resources and borrow records
     * @param library
     */
    public LibraryVisitor(Library library) {
        this.setLibrary(library);
    }

    /**
     * This method retrieves the list of resources borrowed by the user
     * and this method is common for all the user types.
     * @param borrower
     * @return
     */
    public List<Resource> getBorrowedResources (User borrower) {
        List<Resource> resources = new ArrayList<>();

        for (BorrowedResource borrowedResource: library.getBorrowedResources()) {
            if (borrowedResource.getBorrower().equals(borrower)) {
                resources.add(borrowedResource.getResource());
            }
        }

        return resources;
    }

    /**
     * This is the visitor method for Student type user
     * to retrieve resources, which she can borrow, i.e. textbooks.
     * @return
     */
    public List<Resource> getStudentBorrowableResources () {
        List<Resource> resources = new ArrayList<>();

        for (Resource resource: library.getBorrowableResources()) {
            if (ResourceType.TEXT.equals(resource.getResourceType())) {
                resources.add(resource);
            }
        }

        return resources;
    }

    /**
     * This is the visitor method for faculty type user
     * to retrieve resources which she can borrow, i.e. textbooks and reference books.
     * @return
     */
    public List<Resource> getFacultyBorrowableResources () {
        List<Resource> resources = new ArrayList<>();

        for (Resource resource: library.getBorrowableResources()) {
            if (ResourceType.TEXT.equals(resource.getResourceType()) || ResourceType.REFERENCE.equals(resource.getResourceType())) {
                resources.add(resource);
            }
        }

        return resources;
    }

    /**
     * This is the visitor method for library admin type user
     * to retrieve the resources which she can borrow, i.e. all the resources.
     * @return
     */
    public List<Resource> getLibraryAdminBorrowableResources () {
        return library.getBorrowableResources();
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
