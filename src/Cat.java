/**
 * Created by Michael Monty on 1/19/2017.
 */
public class Cat extends Pet {

    public Cat(){
        rename("Fluffy");
    }

    public Cat(String newName){
        rename(newName);
    }

    public void talk(){
        System.out.println("purr");
    }
}
