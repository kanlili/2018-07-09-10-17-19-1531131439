package practice02;

public class Student extends Person{
    public String klass;
    public Student(String name, int age, String klass) {
        super(name, age);
        this.klass = klass;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public  void  introduce(){
        System.out.println("My name is"+ getName()+". I am "+getClass()+".");
    }
}