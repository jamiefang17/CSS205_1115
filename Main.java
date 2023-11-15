public class Main {
    public static void main(String[] args) {
        GetSound dog = new Dog();
        GetSound cat = new Cat();
        GetSound bird = new Bird();

        System.out.println("Dog: " + dog.getSound());
        System.out.println("Cat: " + cat.getSound());
        System.out.println("Bird: " + bird.getSound());
    }
}