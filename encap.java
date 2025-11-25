
// encapsulation id the process of keeping the data safe inside the class
// by providing the accessing control.

//by making the getter and the setter function
//by making the private class

public class encap {
    public static void main(String[] args) {
      Student s=new Student();
      s.setName("Shrinivas");
      s.setAge(15);
      System.out.println(s.getName());
      System.out.println(s.getAge());
    }
}

// hence by using the getter and the setter function we have implemented the 
// encapsulated class

class Student {
    private String name;
    private int age;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

}
