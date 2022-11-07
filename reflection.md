Use this file to record your reflection on this assignment.

Which methods did you decide to overload, and why?

Overloaded methods:

I chose to overload all of the constructors and at least one method for each of the subclasses. I overloaded the constructors and made default constructors, because I thought that not everyone knows all the information about a building. I also overloaded the constructor so that it only takes the name or the name and the address, since those are pieces of information that can be easily found on the internet or from others. It would also be efficient in initalizing attributes of each class. I also realized that not everyone might know the specifics of each building, so the default constructor will be there as a foundation to initalize the attributes.

For House:
I overloaded the constructor and also the moveOut method. I chose to do this because majority of students must move out of their houses for summer or winter break. 

The moveOut method is overloaded so that all residents within the residents ArrayList is cleared out, so that no residents live in the house.


For Library:
I overloaded the constructor, the returnBook method, and the removeTitle method. I chose to overload these methods because for school libraries, titles must be returned by the end of the academic year, and instances where libraries are renovated (like Neilson) or no longer act as a functioning library (Young) all books must be removed.

The returnBook method is overloaded so that all false values within the Hashtable are replaced to true. All books that are checked out have the false value, so they will be returned to the library.

The removeTitle method is overloaded so that all books within the Hashtable are cleared out, so there are no books within the collection to accomodate the state of the library.


For Cafe:
I overloaded the constructor and the restock method. I chose to overload the restock method because all of the other ingredients required in making coffee are constantly consumed, and coffee is (probably) the main ingredient for most coffee drinks, so the method will only restock the coffee since they probably run out fastest.



What worked, what didn't, what advice would you give someone taking this course in the future?
I thought that overriding was a lot simpler than I had anticipated because of how efficient and easy it was to use super to call on the attributes and methods of the superclass. I thought overriding for the two methods were fairly simple, but I had a difficult time figuring out how to overload some of the methods. I would advise someone taking this course in the future to really understand what super does, and understand the concept of polymorphism before trying to overload random methods.