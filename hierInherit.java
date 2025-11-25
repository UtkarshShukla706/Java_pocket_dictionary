public class hierInherit {
    public static void main(String[] args) {
        Cat c =new Cat();
        Buffalo b=new Buffalo();

        b.walk();
        b.eat();
        c.walk();
        c.run();
    }
}

class Animal3{
    void breathe(){
        System.out.println("breathing");
    }
}

class Mammal1 extends Animal3{
    void walk(){
      System.out.println("the mammal is walking on the earth");
    }
}

class Cat extends Mammal1{
    void run(){
        System.out.println("the cat is running");
    }
}

class Buffalo extends Mammal1{
    void eat(){
        System.out.println("eating the grass");
    }
}