import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Cat().GetSound());
        System.out.println(new Dog().GetSound());
        System.out.println(new Horse().GetSound());   

        User user =new User("Jamie");
        System.out.println(user);
        Instructor instructor =new Instructor("Dexter");
        System.out.println(instructor);

        var usersList = new ArrayList<User>();
        usersList.add(instructor);
        System.out.println(new Cat().CanSwim());
        System.out.println(new Horse().CanSwim());
        System.out.println(new Dog().CanSwim());

        PrintUsers(usersList);

        B b = new B("Apple", "Carrot", "Lettuce", "Tomato");
        System.out.println(b.Present);
    }

    public static void PrintUsers(ArrayList<User> users){
        for(var user :users){
            System.out.println(users);

        }
    }
        
    }

