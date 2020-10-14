package practice08;

public class Teacher extends Person {
    Klass klass;
    final String teacherIntroduction = " I am a Teacher. I ";

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }


    public Teacher(int id, String name, int age) {
        super(id, name, age);
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
