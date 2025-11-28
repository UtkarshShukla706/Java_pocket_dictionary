// public class throwsException {
//     public static void main(String[] args) {
//         checkAge(15);
//     }

//     static void checkAge(int age) {
//         if (age < 18) {
//             throw new ArithmeticException("Access is denied because the age is less than 18");
//         } else {
//             System.out.println("you are the person that is eligible to vote");
//         }
//     }
// }

class over {
    public void show(int a) throws Exception {
        if (a > 1 && a <= 10) {
            System.out.println("the number value has been accepted");
        }

        else {
            throw new Exception("the number is not defined correctly");
        }
    }
}

public class throwException {
    public static void main(String[] args) {
        over obj = new over();
        try {
            obj.show(51);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

// throw statement in the java is generally used for creating the user defined
// exception
// for declaring the new Exception it requires the Throws statement also to
// throw the exception that is generated
