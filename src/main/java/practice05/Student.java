package practice05;

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
        super.introduce();
        System.out.println("I am a Student. I am at"+getClass()+".");
    }
}
