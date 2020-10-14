package practice07;

public class Teacher extends Person {
    Klass klass;
    final String teacherIntroduction = " I am a Teacher. I ";

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }


    public Teacher(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        return klass != null && klass.getNumber() != 0 ? super.introduce() + teacherIntroduction + "teach Class " + klass.getNumber() + "." : super.introduce() + teacherIntroduction + "teach No Class.";
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduceWith(Student student) {
        return student.getKlass().getNumber() == klass.getNumber() ? super.introduce() + teacherIntroduction + "teach " + student.getName() + "." : super.introduce() + teacherIntroduction + "don't teach " + student.getName() + "." ;
    }
}
