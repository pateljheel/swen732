# Visitor Pattern

- Adopted from [refactoring.guru](https://refactoring.guru/design-patterns/visitor).

## Library Visitor

- In this small demo I've implemented a simple Library system which is used by 3 types of users:
  1. Student
  2. Faculty
  3. Library Admin
- Each user is represented by an object of its class.
- There is a Library resource which houses all the resources and borrow records.
- There is a LibraryVisitor resource which implements a Visitor interface with the following methods:
  1. getBorrowedResources(): This will be called by all the users and expects the User object as input. It returns list of resources borrowed by the user.
  2. getStudentBorrowableResources(): This is the visitor method called by Student type user to retrieve resources, which she can borrow, i.e. textbooks.
  2. getFacultyBorrowableResources(): This is the visitor method called by Faculty type user to retrieve resources, which she can borrow, i.e. textbooks and reference books.
  2. getLibraryAdminBorrowableResources(): This is the visitor method called by Library Admin type user to retrieve resources, which she can borrow, i.e. all the resources.
