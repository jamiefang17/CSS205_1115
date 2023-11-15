// The Animals interface
public interface Animals {
    // This can be an empty interface or have animal-related methods
}

// Dog class
class Dog implements Animals, GetSound {
  
    public String getSound() {
        return "Bark";
    }
}

// Cat class
class Cat implements Animals, GetSound {
    
    public String getSound() {
        return "Meow";
    }
}

// Bird class
class Bird implements Animals, GetSound {
   
    public String getSound() {
        return "Tweet";
    }
}