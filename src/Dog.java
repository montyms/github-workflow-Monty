/**
 * Created by Michael Monty on 1/19/2017.
 */
public class Dog extends Pet {

    public Dog(){
        rename("Fido");
    }

    public Dog(String newName){
        rename(newName);
    }

    public void talk(){
        System.out.println("woof");
    }

}
