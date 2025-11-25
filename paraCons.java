public class paraCons {
    public static void main(String[] args) {
        // the parameteric constructors are those types of the constructors that contain some parametric values

        Pen1 p=new Pen1();

        Pen1 p1=new Pen1("Blue");
        Pen1 p2=new Pen1("Black",15,16);

        System.out.println(p.color);
        System.out.println(p1.color);
        System.out.println(p2.tip);
    }
}

class Pen1{
    String color;
    int tip;
    int length;

    Pen1(String color,int tip,int length){
      this.color=color;
      this.tip=tip;
      this.length=length;
    }

    Pen1(String color){
        this.color=color;
    }
     

    // hence this is the example of the non parametric constructor
    // because parameteric value does not present in it...
    Pen1(){
        this.color="green";
        this.tip=15;
        this.length=18;
        System.out.println("The pen is not available please try again later");
    }
}


// this process is also called the Constructor Overloading  where the constructors having the different parameters but have the same name as that of the
// class had been called....
