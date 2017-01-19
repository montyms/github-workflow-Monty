/**
 * Created by Michael Monty on 1/19/2017.
 */
import java.util.ArrayList;

public class Store {
    private ArrayList<Pet> inventory = new ArrayList<Pet>();



    public void buy(Pet friend){
        this.inventory.add(friend);
        System.out.println("You have a new friend named " + friend.getName());
    }

    public void sell(Pet animal){
        inventory.remove(animal);
        System.out.println("Goodbye " + animal.getName() + ", I'm sure we'll meet again some day.");
    }

    public void showInventory(){
        if (inventory.size() == 0){
            System.out.println("Sorry, we have no pets for you today");
        }
        else{
            System.out.print("Pets for sale include: ");
            for (Pet i: inventory){
                System.out.print(i.getName() + ", ");
            }
            System.out.println("");
        }
    }
}
