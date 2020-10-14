package practice09;

public class Student extends Person {
    Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public String introduce(){
        return klass.getLeader() == null ? super.introduce() + " I am a Student. I am at Class " + klass.getNumber() + "." : super.introduce() + " I am a Student. I am Leader of Class " + klass.getNumber() + ".";
    }
    public Klass getKlass() {
        return klass;
    }

}
