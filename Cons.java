// Constructors are the methods which invoked automatically at the times of the object creation

// Constructors have the same name or structure as that of the class

// Constructors does not return any value

// the memory is allocated in the constructor when the object is called

public class Cons {
    public static void main(String[] args) {
        Student1 s1=new Student1("Utkarsh",15);
         System.out.println(s1.name);
         System.out.println(s1.age);    
    }
}

class Student1{
    String name;
    int age;

    Student1(String name,int age){
       this.name=name;
       this.age=age;
    }
}


