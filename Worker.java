package practice04;

public class Worker extends Person {

    public Worker(String name, int age) {
        super(name, age);
    }
    public  void introduce(){
        super.introduce();
        System.out.println(" I am a Worker. I have a job.");
    }
}
