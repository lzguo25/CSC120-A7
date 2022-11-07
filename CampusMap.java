import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }



    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street, Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court, Northampton, MA 01063", 4));

        myMap.addBuilding(new House("Cutter House", "10 Prospect Street, Northampton, MA 01063", 3, true, true ));
        myMap.addBuilding(new House("Gardiner House", "1 Paradise Road, Northampton, MA 01063", 4, false, false));
        myMap.addBuilding(new House("Ziskind House", "1 Prospect Street, Northampton, MA 01063", 3, true, true));
        myMap.addBuilding(new Library("Neilson Library", "Neilson Drive, Northampton, MA 01063", 5,true));
        myMap.addBuilding(new Library("Compass Cafe", "Neilson Drive, Northampton, MA 01063", 1,true));
        myMap.addBuilding(new Building("Smith College Museum of Art", "39 Elm Street, Northampton, MA 01063", 4));
        myMap.addBuilding(new Cafe("Campus Center Cafe", "100 Elm Street, Northampton, MA 01063", 2, 100,100,100,100,true));
        myMap.addBuilding(new House("Cushing House", "32 Paradise Road, Northampton, MA 01060", 4, true, false));
        myMap.addBuilding(new House("Wilder House", "1 Mandelle Road, Northampton, MA 01063", 4, true, true ));
        myMap.addBuilding(new Building("Seeyle Hall", "2 Seelye Drive, Northampton, MA 01063", 4));
        myMap.addBuilding(new Library("Hillyer Art Library", "20 Elm Street, Northampton, MA 01063", 3, true));

        System.out.println(myMap);
        
    }

        
    
}
