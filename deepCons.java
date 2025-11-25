public class deepCons {
    public static void main(String[] args) {
        
        Student5 s1=new Student5("karthik",84);
        s1.marks[0]=14;
        s1.marks[1]=14;
        s1.marks[2]=14;

        Student5 s2=new Student5(s1);
        s1.display();
        s2.display();

        s1.marks[0]=15;

        s1.display();
        s2.display();


    }
}

class Student5{
    String name;
    int age;
    int[] marks=new int[3];

    // hence the first constructor

    Student5(String name,int age){
        this.name=name;
        this.age=age;
    }

    Student5(Student5 s1){
        this.name=s1.name;
        this.age=s1.age;
       
        for(int i=0;i<3;i++){
             this.marks[i]=s1.marks[i];
        }
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


    // in the deep copy the changes doesn't reflected...
    // it copy the value of the array not the reference of the array
    // each of the object call different memory allocations...

}

