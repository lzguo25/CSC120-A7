/* This is a stub for the Cafe class */

/**
 * Extended class of Building to create a Cafe where there is an inventory to make coffee which can be used and restocked.
 * @param attributes from inheritance 
 * @return parameters or information of the Cafe building.
 */
public class Cafe extends Building {

    private int nCoffeeOunces; //The number of ouncess of coffee remaining in inventory
    private int nSugarPackets; //The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream reamining in inventory
    private int nCups; //The number of cups remaining in inventory

    /*Default Constructor */
    public Cafe(){
        this("Cafe name", "Cafe address", 10,10,10,10,10);
     }


    /*Complete Constructor for the Cafe */
    public Cafe(String name, String address, int nFloors, int coffee, int sugar, int cream, int cups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = coffee;
        this.nSugarPackets= sugar;
        this.nCreams= cream;
        this.nCups= cups;

        System.out.println("You have built a cafe: ☕");
    }


    /**
     * Method that decreases the amount of inventory by 1 each time a coffee is sold
     * @param size coffee size in ounces
     * @param sugar packs of sugar required
     * @param cream splashes of cream required
     * @return how much of each ingredient is left in the inventory after making coffee
     * @return if the inventory is restocked, it prints out a statement saying how much of each ingredient is available in the inventory now
     */
    public void sellCoffee(int size, int sugar, int creams, int cups){
        if (nCoffeeOunces <1 || nCreams<1 || nSugarPackets<1 || nCups<1){
            System.out.println("Out of Inventory. Please Restock.");
            restock(size, nSugarPackets, nCreams, nCreams);
            System.out.println("Inventory Stocked: " + nCoffeeOunces + " ounces of coffee, " + nSugarPackets + " sugar packets, " + nCreams + " splashes of cream, " + nCups + " cups ");
        }

        //this is for when there is enough inventory in the cafe
        this.nCoffeeOunces -=size;
        this.nSugarPackets -=sugar;
        this.nCreams -= creams;
        this.nCups -= cups;

        System.out.println("Current Inventory: " + nCoffeeOunces + " ounces of coffee, " + nSugarPackets + " sugar packets, " + nCreams + " splashes of cream, " + nCups + " cups ");
    }


    /**
     * Method that allows us to restock cafe inventory when there is insufficient inventory
     * @param nCoffeeOunces coffee size in ounces
     * @param nSugarPackets packs of sugar
     * @param nCreams splashes of cream
     * @param nCups how many cups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }

    /*Overloads the restock method. Only the cups will be restocked */
    private void restock(int nCups){
        this.nCups = nCups;
    }

    

     /*Overrides showOptions method from the Building class. Prints out what options are available for the House. */
     @Override
     public void showOptions(){
       super.showOptions();
       System.out.println(" + sellCoffee(size, sugar, creams)");
       
     }



    public static void main(String[] args) {
        Cafe compassCafe = new Cafe("Compass Cafe", "Neilson Library - Smith College",4, 2,5,8,3 );
        
        compassCafe.sellCoffee(2,2,2,2);
        compassCafe.sellCoffee(1,1,3,3);

    }

    
}
