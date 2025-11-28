import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class throwsException {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int a, b, c;
        System.out.println("enter the value of the a:");

        a = Integer.parseInt(br.readLine());

        System.out.println("enter the value of the b:");

        b = Integer.parseInt(br.readLine());

        c = a + b;
        System.out.println("the sum of the two numbers are :" + c);

    }
}

// throws statement is used for the exception handling in the java..
// it is also used for the initialization of the exception also
