public class hybridinherit {
    public static void main(String[] args) {
        Lion l=new Lion();
        Cheetah c=new Cheetah();
        Tuna t=new Tuna();
        Shark s= new Shark();

        l.walk();
        c.breathe();
        s.swim();
        t.live();
    }
}

class Animal4 {
    void breathe(){
        System.out.println("the breathe");
    }
}

class Mammal2 extends Animal4{
    void walk(){
        System.out.println("the mammals are living on the planet");
    }
}

class Fish extends Animal4{
    void swim(){
        System.out.println("the fish is swimming on the river");
    }
}

class Lion extends Mammal2{
    void eat(){
        System.out.println("eating the flesh");
    }
}

class Cheetah extends Mammal2{
    void eat2(){
        System.out.println("eating the chicken");
    }
}

class Shark extends Fish{
    void sleep(){
        System.out.println("live inside and sleep inside ");
    }
}

class Tuna extends Fish{
    void live(){
        System.out.println("living in the ocean");
    }
}