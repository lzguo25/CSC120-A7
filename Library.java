import java.util.Hashtable; //imports Hastable so that we can store keys and values for the library

/* This is a stub for the Library class */

/**
 * Extended class of Building to create a Library where there is a collection of books that can be checked in and out.
 * @param attributes from inheritance 
 * @return parameters or information of the Library building.
 */
public class Library extends Building {
  private Hashtable<String, Boolean> collection; //Hastable to store library books
  private boolean hasElevator;

  /*new default constructor */
  public Library(){
    this("Library name", "Library address", 1, false);
  }

  /*Complete Constructor */
    public Library(String name, String address, int nFloors, boolean hasElevator) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String,Boolean>();
      this.hasElevator = hasElevator;
      System.out.println("You have built a library: 📖");

    }

    /**
     * Adds books to the library
     * @param title the title of the book being added
     * @return a statement stating that the title has been added into the collection
     */
    public void addTitle(String title){ //adds a book to the collection
      collection.put(title, true);
      System.out.println(title + " has been added to the library");

    }
  
    /**
     * Removes books from the library
     * @param title the title of the book being removed
     * @return a statement stating that the title has been removed from the library.
     * @return the title that was removed
     */
    public String removeTitle(String title){// return the title that we removed
      collection.remove(title);
      System.out.println(title + " has been removed from the library");
      return title; //returns title that was removed
    } 

    /*Overloads the removeTitle method. Clears out the entire collection in the case that the library is shut down, or the collection must be relocated. */
    public void removeTitle(){
      collection.clear();
    }

    /**
     * Updates the status of a book when it has been checked out of the library by changing the boolean values from true to false
     * @param title title of the book that is being checked out
     * @return doesn't return anything but prints out a statement saying that the param title has been checked out of the library
     */
    public void checkOut(String title){//modifies the value associated with the title
      collection.replace(title, true, false);
      System.out.println(title + " has been checked out of the library.");
    }

    /**
     * Updates the status of a book when it has been returned to the library by changing the boolean value from false to true
     * @param title title of the book that is being returned
     * @return doesn't return anything but prints out a statement saying that the param title has been returned to the library
     */
    public void returnBook(String title){
      collection.replace(title, false, true);
      System.out.println(title + " has been returned to the library.");
      
    }

    /*Overloads the returnBook method. All books that were once checked out will now be returned to the library */
    public void returnBook(){
      collection.replaceAll((key, oldValue) -> true);
    }


     /*Overrides showOptions method from the Building class. Prints out what options are available for the Library. */
     @Override
     public void showOptions(){
       super.showOptions();
       System.out.println(" + addTitle(title)\n + removeTitle(title)\n + checkOut(title)\n + returnBook(title)\n + isAvailable(title)\n + printCollection()");
     }

      /*Overrides gotToFloor method from the Building class. Prints out which floor you're going to. */
      @Override
      public void goToFloor(int floorNum){
      super.goToFloor(floorNum);
      if (hasElevator == true){
        System.out.println("...Using elevator...");
        super.goToFloor(floorNum);
      }
      else{
        System.out.println("This library doesn't have an elevator. Please take the stairs.");
      }
    }      
        

    /**
     * Checks if certain titles are within the library collection 
     * @param title title of the book that we want to check
     * @return T/F: whether the book is in the library or not
     */
    public boolean containsTitle(String title){ //returns true if the title appears as a key in the Library's collection, false otherwise
      if (collection.contains(title)){
        return true;
      }
      else{
        return false;
      }
    }

    /**
     * Checks if a certain book is available in the library 
     * @param title title of the book that we want to check
     * @return T/F: whether the book is available or not
     */
    public boolean isAvailable(String title){ //returns true if the title is currently avaiable, false otherwise
      if (collection.containsKey(title)){
        if (collection.get(title) == true){
          System.out.println(title + " is avaiable");
          return true;
        }
        else{
          System.out.println(title + " is currently unavailable");
          return false;
        }
      }
      throw new RuntimeException(title + " doesn't exist in this library. Please check the collection again.");
    }



    /**Prints out the entire collection of books in the library */
    public void printCollection(){// prints out the entire collection in an easy-to-read way (including checkout status)
      System.out.println(collection);
    }

  

    public static void main(String[] args) {
      Library hillyerLibrary = new Library("Hillyer", "20 Elm St, Northampton, MA 01063",3, true );

      System.out.println(hillyerLibrary);
      hillyerLibrary.addTitle("Son of the Revolution");
      hillyerLibrary.addTitle("The Burning God");
      hillyerLibrary.checkOut("Son of the Revolution");
      hillyerLibrary.containsTitle("Son of the Revolution");
      hillyerLibrary.isAvailable("Son of the Revolution");
      hillyerLibrary.printCollection();
    }
  
  }