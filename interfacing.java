public class interfacing{
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        v1.start();
        Vehicle v2= new Car();
        v2.start();
    }
}

interface Vehicle{
    void start();
}

class Car implements Vehicle{
    public void start(){
        System.out.println("the car starts");
    }
}

class Bike implements Vehicle{
    public void start(){
      System.out.println("bike is also start");
    }
}

// an Interface in the java is the abstract class like structure that is used to hide the internal 
// operation which is not needed...

// we can use the abstract class or we can also implement the multiple inheritance using this..
// the class is used to implements the interface