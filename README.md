                                                                              *Collection List Excercise*
Exercise: Library Book Management System                               

You are tasked with designing a mini library system to manage books and users by only using ArrayList, LinkedList, Vector and Stack. You need to implement the following requirements:

Book Storage
You need a collection to store all books in the library.

Requirements:
Frequent searches by index.

Fast random access.
Recently Borrowed Books
Keep track of the last 5 books a user borrowed.

Requirements:
Books should be removed in the order they were borrowed when the limit is reached.
Fast addition/removal from both ends.
Waiting List for Popular Books
Some books are popular, and users can join a waiting list.

Requirements:
Only one user can borrow the book at a time.
You need a stack-like behavior so that the last user to join is served last.
Library Events Log
Keep a log of all actions taken (borrowed, returned, reserved).

Requirements:
Thread-safe operations, because multiple librarians may update the log simultaneously.

Your Task:
Decide which List implementations (ArrayList, LinkedList, Vector, Stack) to use for each of the four requirements and justify your choice.
Implement basic operations for each: adding, removing, retrieving items, etc., as required by the scenario.
