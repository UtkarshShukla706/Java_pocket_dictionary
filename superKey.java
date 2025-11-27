public class superKey {
    public static void main(String[] args) {
        new Teacher().speak();
    }
}

class Chairman {
    void speak() {
        System.out.println("the Chairman is speaking something");
    }
}

class Teacher extends Chairman {
    void speak() {
        super.speak();
        System.out.println("the teacher is speaking something ");
    }
}

// super keywords are those type of the keywords which allow the user to access
// the parent class variables methods and constructors in different classes...
