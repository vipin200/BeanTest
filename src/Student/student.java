package Student;

import java.io.Serializable;

public class student implements Serializable {
    private int roll_no;
    private String name;
    private double grade;
    student()
    {
        roll_no=0;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
}
