import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<BorrowedResource> borrowedResources;
    private List<Resource> borrowableResources;

    public Library() {
        this.borrowedResources = new ArrayList<>();
        this.borrowableResources = new ArrayList<>();
    }

    public void addResource (Resource resource) {
        this.borrowableResources.add(resource);
    }

    public void addBorrowRecord (BorrowedResource borrowedResource) {
        this.borrowedResources.add(borrowedResource);
    }

    public List<BorrowedResource> getBorrowedResources() {
        return borrowedResources;
    }

    public List<Resource> getBorrowableResources() {
        return borrowableResources;
    }
}
