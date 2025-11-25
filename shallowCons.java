public class shallowCons {
    public static void main(String[] args) {
        
        Student4 s1=new Student4("karthik",84);
        s1.marks[0]=14;
        s1.marks[1]=14;
        s1.marks[2]=14;

        Student4 s2=new Student4(s1);
        s1.display();
        s2.display();

        s1.marks[0]=15;

        s1.display();
        s2.display();


    }
}

class Student4{
    String name;
    int age;
    int[] marks=new int[3];

    // hence the first constructor

    Student4(String name,int age){
        this.name=name;
        this.age=age;
    }

    Student4(Student4 s1){
        this.name=s1.name;
        this.age=s1.age;
        this.marks=s1.marks;
    }

    void display(){
         System.out.println("Name of the Student:" + name);
        System.out.println("Age of the Student" + age);
        System.out.println("marks :");

        for (int m : marks) {
            System.out.println(m + " ");
        }

        System.out.println();
    }


    // the shallow copy is the process which copies the referenec of the array memory address where the data is stored 
    // both the object allocates at the same memory address
    // changes are reflected in the shallow copy
}
