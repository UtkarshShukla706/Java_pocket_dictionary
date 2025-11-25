public class abstraction {
    public static void main(String[] args) {
        Parents1 p;
        p=new child3();
        p.eat();

        p= new child4();
        p.eat();


    }
}
//  abstraction is the process of hiding the details that are not needed

abstract class Parents1{

    // abstarct method
    abstract void eat();

}

class child3 extends Parents1{
    @override
    void eat(){
        System.out.println("the child is eating ");
    }
}

class child4 extends Parents1{
    @override
    void eat(){
        System.out.println("the another boy is also eating");
    }
}