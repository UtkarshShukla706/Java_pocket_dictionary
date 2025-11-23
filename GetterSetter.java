public class GetterSetter {
    public static void main(String[] args) {
       Student s=new Student();
       s.setName("Bhuvan Bam");
       s.setAge(15);

       System.out.println(s.getName());
       System.out.println(s.getAge());
    }
}

class Student {
    String name;
    int age;

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
