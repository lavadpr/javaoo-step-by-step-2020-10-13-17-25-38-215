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
        return klass != 0 ? super.introduce() + " I am a Teacher. I teach Class " + klass + "." : super.introduce() + " I am a Teacher. I teach No Class.";
    }
    public int getKlass() {
        return klass;
    }
}
