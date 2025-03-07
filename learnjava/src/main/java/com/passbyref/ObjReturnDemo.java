package com.passbyref;

class Student{
    private String studentId;
    private int mark1;
    private int mark2;

    public Student(String studentId, int mark1, int mark2) {
        this.studentId = studentId;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }
}

class Result {
    private String studentId;
    private String grade;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Result{" +
                "studentId='" + studentId + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}

class ResultCalculator {
    public Result calculateResult(Student student) {
        int total = student.getMark1() + student.getMark2();
        Result result = new Result();
        result.setStudentId(student.getStudentId());
        if(total < 60) {
            result.setGrade("Fail");
        } else {
            result.setGrade("Pass");
        }
        return result;
    }
}

public class ObjReturnDemo {
    public static void main(String[] args) {
        ResultCalculator resultCalculator = new ResultCalculator();
        Student student = new Student("S2", 20, 10);
        Result result = resultCalculator.calculateResult(student);
        System.out.println(result);

    }
}
