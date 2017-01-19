/**
 * Created by Michael Monty on 1/19/2017.
 */
public class Pet {
    private String name;

    public Pet(){
        name = "Bob";
    }

    public Pet(String colar){
        name = colar;
    }

    public void rename(String new_name){
        name = new_name;
    }

    public String getName(){
        return this.name;
    }

    public void eat(){
        System.out.println(name + " noms on some chow");
    }

    public void sleep() {
        System.out.println(name + " takes a snooze");
    }

    public void poop(){
        System.out.println(name + " makes a mess");
    }
}
