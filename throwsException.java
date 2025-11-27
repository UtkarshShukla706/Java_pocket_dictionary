public class throwsException {
    public static void main(String[] args) {
        checkAge(15);
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access is denied because the age is less than 18");
        } else {
            System.out.println("you are the person that is eligible to vote");
        }
    }
}
