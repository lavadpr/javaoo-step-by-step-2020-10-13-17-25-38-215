package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> members = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student leader) {
        if(members!=null){
            for(Student member: members){
                if (leader.getName().equals(member.getName())) {
                    this.leader = leader;
                    break;
                }
            }
        }
        if(this.leader==null)
            System.out.print("It is not one of us.\n");
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student member) {
        if(member.klass.getNumber() == number)
            members.add(member);
    }
}
