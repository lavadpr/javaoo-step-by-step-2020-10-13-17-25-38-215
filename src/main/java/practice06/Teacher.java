package practice06;

public class Teacher extends Person{
    int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        String teacherIntroduction = " I am a Teacher. ";
        return klass != 0 ? super.introduce() + teacherIntroduction + "I teach Class " + klass + "." : super.introduce() + teacherIntroduction + "I teach No Class.";
    }
    public int getKlass() {
        return klass;
    }
}
