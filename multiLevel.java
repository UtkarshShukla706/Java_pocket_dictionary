public class multiLevel {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.walk();
        d.breathe();
        d.Bark();
    }
}

class Animal1{
  void breathe(){
    System.out.println("Breathing");
  }
  void eat(){
    System.out.println("eating");
  }
}

class Mammal extends Animal1{
   void walk(){
    System.out.println("walking");
   } 
}

class Dog1 extends Mammal{
  void Bark(){
    System.out.println("bark");
  }
}


