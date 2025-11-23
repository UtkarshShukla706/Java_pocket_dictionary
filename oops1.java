public class oops1 {
       public static void main(String[] args) {
        // now creating the class for the java 
        Pen p = new Pen();
        p.setColor("black");
        p.setTip(15);

        System.out.println(p.color);
        System.out.println(p.tip);
    }
}
 class Pen{
        String color;
        int tip;
         //function for the color of the pen 
         void setColor(String newColor){
            color=newColor;
         }
         void setTip(int newTip){
            tip=newTip;
         }
    }

