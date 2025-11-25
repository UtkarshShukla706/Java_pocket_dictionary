public class copyCons {
    public static void main(String[] args) {

       Student2 s2=new Student2("Utkarsh",15);
       s2.marks[0]=15;
       s2.marks[1]=21;
       s2.marks[2]=30;

       Student2 s3= new Student2(s2);

       s2.display();
       System.out.println();

       s3.display();

    }
}

class Student2 {
    String name;
    int age;
    int[] marks=new int[3];

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student2(Student2 s1){
      this.name=s1.name;
      this.age=s1.age;
      this.marks=s1.marks; 
    }

    void display() {
        System.out.println("Name of the Student:" + name);
        System.out.println("Age of the Student" + age);
        System.out.println("marks :");

        for (int m : marks) {
            System.out.println(m + " ");
        }

        System.out.println();
    }
}

//copy constructors are those kinds of the constructors which is used to copy the data of one object to another object...
