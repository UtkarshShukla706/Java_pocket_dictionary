public class polymorph {
    public static void main(String[] args) {
        Add a1 = new Add();

        System.out.println("the first is the addition of the two numbers in the java: " + a1.add(12, 13));
        System.out.println("the second is the addition of the three numbers in the java: " + a1.add(12, 13,14));

    }
}

// Polymorphism means one entity having the different forms
// in java we are we are having the same method with different behaviour based
// on the object...

class Add {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}


// hence it is the example of the compile time polymorphism (method overloading)
// in this same method name are having the different number of the parameters


