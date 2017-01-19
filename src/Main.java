/**
 * Created by Michael Monty on 1/19/2017.
 */
public class Main {
    public static void main(String[] args){

        Store s = new Store();
        s.showInventory();  //show starting inventory
        Cat milo = new Cat("Milo");
        Dog otis = new Dog("Otis"); // add two pets
        s.buy(milo);
        s.buy(otis); // include pets in store
        milo.talk();
        otis.talk(); // pets perform actions
        s.showInventory(); // new store inventory
        milo.sleep();
        otis.eat();
        s.sell(milo);  // remove a pet from inventory
        Hamster alvin = new Hamster("Alvin");
        Hamster simon = new Hamster("Simon");
        Hamster theo = new Hamster("Theo");
        alvin.talk();
        simon.talk();
        theo.talk();
        s.showInventory(); // newly introduced pets are still not officially part of inventory
        s.buy(alvin);
        s.buy(simon);
        s.buy(theo);  // new pets included in inventory
        s.showInventory();  // show new inventory
        otis.poop();
        s.sell(otis); // pet leaves inventory
        s.showInventory(); // sho final inventory
    }
}