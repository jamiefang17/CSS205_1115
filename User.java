public class User extends Object{

    String name;


    public User(String name) {
        super();
        this.name =name;
    }

    
    @Override
    public String toString(){
        return name;
    }
    
}
