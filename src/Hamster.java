/**
 * Created by Michael Monty on 1/19/2017.
 */
public class Hamster extends Pet{
    public Hamster(){
        rename("Hamilton");
    }

    public Hamster(String newName){
        rename(newName);
    }

    public void talk(){
        System.out.println("squeak");
    }
}