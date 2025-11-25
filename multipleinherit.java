public class multipleinherit {
    public static void main(String[] args) {
       C c= new C();
       c.show();
       c.seen();

    }
}

interface A{
    void show();
}
 
interface B{
    void seen();
}

class C implements A,B{
    public void show(){
      System.out.println("someone is showing me something...");
    }

    public void seen(){
        System.out.println("someone seen me doing the nuggets");
    }
}