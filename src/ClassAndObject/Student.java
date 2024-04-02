package ClassAndObject;

public class Student {

    private String studentName;

    private int studentAge;

    private double studentGrade;

    public Student(String studentName, int studentAge, double studentGrade){
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
    }

    public String getStudentName(){

        return studentName;
    }

    public void setStudentName(){

        this.studentName = studentName;
    }

    public int getStudentAge(){

        return studentAge;
    }

    public void setStudentAge(){

        this.studentAge = studentAge;
    }

    public double getStudentGrade(){

        return studentGrade;
    }

    public void setStudentGrade(){

        this.studentGrade = studentAge;
    }

    public String toString()
    {
        return "hoc sinh: " + studentName + " " + studentAge + " tuoi " + ",co diem thi la: " + studentGrade;
    }
}
