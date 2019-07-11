package practice07;


public class Teacher extends  Person {
    public  String klass;

    public Teacher(String name, int age) {
        super(name, age);
    }
    public Teacher(String name, int age, String klass) {
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
        if(getClass()==null) {
            System.out.println("I am a Teacher. I teach No Class.");
        }else {
            System.out.println("I am a Teacher. I teach" + getClass() + ".");
        }

    }
    public  void  introduceWith(Student student){
        super.introduce();
        if(student.getKlass().getDisplayName().equals(getKlass())){
            System.out.println("I am a Teacher. I teach"+student.getName()+".");
        }else{
            System.out.println("I am a Teacher. I don't teach"+student.getName()+".");
        }
    }
}
