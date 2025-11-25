public class runtimepoly {
    public static void main(String[] args) {
        Parents p;
        // p.age();
        p = new child1();
        p.age();

        p = new child2();
        p.age();
    }
}

class Parents {
    void age() {
        System.out.println("the age of the parents are greater than that of the kid ");
    }
}

class child1 extends Parents {
    @override
    void age() {
        System.out.println("the age of the first is 12");
    }

}

class child2 extends Parents {
    @override

    void age() {
        System.out.println("the age of the second is 10");
    }
}

// this is the example of the run time polymorphism where the properties of the
// parents class are override by the child classby using the override
// annotations
