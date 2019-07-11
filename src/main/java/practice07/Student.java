package practice07;

public class Student extends Person{
    public Klass klass;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public  void  introduce(){
        super.introduce();
        System.out.println("I am a Student. I am at"+getClass()+".");
    }
}
