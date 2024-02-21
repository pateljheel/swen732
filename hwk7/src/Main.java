public class Main {
    public static void main(String[] args) {
        // create 3 users, each of type Student, Faculty and Library Admin
        Student student0 = new Student("jp9959", StudentType.GRADUATE, "SWEN");
        Faculty faculty0 = new Faculty("abdcd", "SWEN");
        LibraryAdmin libraryAdmin0 = new LibraryAdmin("la123");

        // create a library object
        Library library = new Library();
        // add some sample resources to the library object
        Resource resource = new Resource("0", "Intro to Information Science", ResourceType.TEXT);
        library.addResource(resource);
        library.addResource(new Resource("1", "Quantum Computing", ResourceType.REFERENCE));
        library.addResource(new Resource("2", "Advances in Information Science", ResourceType.RESERVED));
        // add a dummy borrow record in the library
        library.addBorrowRecord(new BorrowedResource(student0, resource));

        // declare a LibraryVisitor object
        LibraryVisitor libraryVisitor = new LibraryVisitor(library);

        // print out the visible borrowable resources for each user type
        // it expects LibraryVisitor object to be passed
        // and the respective user calls the corresponding method in the LibraryVisitor object
        System.out.println(student0.getBorrowableResources(libraryVisitor));
        System.out.println(faculty0.getBorrowableResources(libraryVisitor));
        System.out.println(libraryAdmin0.getBorrowableResources(libraryVisitor));

        System.out.println(student0.getBorrowedResources(libraryVisitor));
    }
}
