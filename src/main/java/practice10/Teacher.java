package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    Klass klass;
    final String teacherIntroduction = " I am a Teacher. I ";
    LinkedList<Klass> classes = new LinkedList();

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.classes.add(klass);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }


    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        if(classes.size() != 0){
            String classNumbers = "";
            for(Klass klas: classes){
                classNumbers += klas.getNumber() + ", ";
            }
            return super.introduce() + teacherIntroduction + "teach Class " + classNumbers.substring(0,classNumbers.length()-2) + ".";
        }
        return super.introduce() + teacherIntroduction + "teach No Class.";
    }

    public Klass getKlass() {
        return klass;
    }

    public LinkedList<Klass> getClasses() { return classes; }

    public String introduceWith(Student student) {
        if(classes.size() != 0){
            for(Klass klas: classes){
                if(student.getKlass().getNumber() == klas.getNumber()){
                    return super.introduce() + teacherIntroduction + "teach " + student.getName() + ".";
                }
            }
        }
        return super.introduce() + teacherIntroduction + "don't teach " + student.getName() + "." ;
    }

    public boolean isTeaching(Student student) {
        for(Klass klas: classes){
            if(klas.getNumber() == student.getKlass().getNumber())
                return true;
        }
        return false;
    }
}
