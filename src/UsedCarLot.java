/** Imports array list package */
import java.util.ArrayList;

/**
 * This class represents a UsedCarLot object
 *
 * @author Zhan Xiang Zheng
 */

public class UsedCarLot {

    /** ArrayList of cars in inventory */
    private ArrayList<Car> inventory;

    /**
     * Initialize a UsedCarLost object
     */
    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    /**
     * Gets the inventory ArrayList
     *
     * @return inventory
     */
    public ArrayList<Car> getInventory() {
        return inventory;
    }

    /**
     * Adds car to inventory
     *
     * @param newCar new car to be added
     */
    public void addCar(Car newCar) {
        inventory.add(newCar);
    }

    /**
     * Swaps the place of two cars in the inventory
     *
     * @param index1 the index of the first car to be switched
     * @param index2 the index of the second car to be switched
     * @return whether the operation was successful or not
     */
    public boolean swap(int index1, int index2) {
        try {
            Car tempCar = inventory.get(index1);
            inventory.set(index1, inventory.get(index2));
            inventory.set(index2, tempCar);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }

    /**
     * Adds a Car to the inventory list at the index specified
     * by indexToAdd; this method increases the size of inventory by 1
     * <p>
     *     PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     * </p>
     *
     * @param indexToAdd the index of where to add the car
     * @param carToAdd the car object to be added
     */
    public void addCar(int indexToAdd, Car carToAdd) { inventory.add(indexToAdd, carToAdd);}

    /**
     * "Sells" the Car located at indexOfCarToSell which
     * removes it from the inventory list and shifting the remaining
     * Cars in the inventory list to the left to fill in the gap;
     * this method reduces the size of inventory by 1
     * <p>
     *     PRECONDITION: indexOfCarToSell &lt; inventory.size()
     * </p>
     *
     * @param indexOfCarToSell the index of the car to be sold
     * @return the car being sold
     */

    public Car sellCarShift(int indexOfCarToSell) {
        Car soldCar = inventory.remove(indexOfCarToSell);
        return soldCar;
    }

    /**
     * "sells" the Car located at indexOfCarToSell,
     * but instead of removing it and shifting the inventory
     * list to the left, REPLACE the Car at indexOfCarToSell
     * with NULL, thus creating an "empty parking spot" on the lot;
     * this method does NOT reduce the size of inventory by 1
     * <p>
     *      PRECONDITION: indexOfCarToSell &lt; inventory.size()
     * </p>
     *
     * @param indexOfCarToSell index of the car to be sold
     * @return the Car that is being "sold" (replaced with null)
     */
    public Car sellCarNoShift(int indexOfCarToSell) {
        Car soldCar = sellCarShift(indexOfCarToSell);
        inventory.add(indexOfCarToSell, null);
        return soldCar;
    }

    /**
     * Moves Car located at index indexOfCarToMove to index destinationIndex;
     * if destinationIndex &lt; indexOfCarToMove, moves the Car to the right in
     * inventory; if destinationIndex &lt; indexOfCarToMove, moves the
     * Car to the left in the inventory. All other cars in the inventory
     * should shift accordingly
     * <p>
     *      PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
     *                     destinationIndex &lt; inventory.size()
     * </p>
     * @param indexOfCarToMove the car to be moved
     * @param destinationIndex the index the car is moving to
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex) {
        inventory.add(destinationIndex, inventory.remove(indexOfCarToMove));
    }

}
