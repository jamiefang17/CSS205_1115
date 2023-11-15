public class Instructor extends User {
    public Instructor(String name) { //type ctor pass name to user
        super(name);
    }


@Override
public String toString(){
    return "Instructor Name:" +name;
}
}
