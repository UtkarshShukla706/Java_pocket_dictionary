public class exceptions {
    public static void main(String[] args) {
        
        int a=10;
        int b=0;

        try{
            int c=a/b;
            System.out.println("the result of the numbers are:"+c);
        }

        catch(Exception e){
            System.out.println("the error is generating on dividing the number from a to b");
        }
    }
}


// Exception Handling in the java are generally occur at the time of the 
// runtime error it can be solved by using the try and catch statement 

// try - perform the operation 
// catch - handle the error that is generated
