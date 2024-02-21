public class BorrowedResource {
    private User borrower;
    private Resource resource;

    public BorrowedResource(User borrower, Resource resource) {
        this.borrower = borrower;
        this.resource = resource;
    }

    public User getBorrower() {
        return borrower;
    }

    public void setBorrower(User borrower) {
        this.borrower = borrower;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "BorrowedResource{" +
                "borrower=" + borrower.getId() +
                ", resource=" + resource.getResourceTitle() +
                '}';
    }
}
