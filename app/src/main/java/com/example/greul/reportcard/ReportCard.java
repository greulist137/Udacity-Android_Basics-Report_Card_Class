package com.example.greul.reportcard;

public class ReportCard {

    //Declare Variables
    private String mStudentName = "";
    private char mEnglishGrade = ' ';
    private char mHistoryGrade = ' ';
    private char mMathGrade = ' ';
    private char mScienceGrade = ' ';
    char[] validGrades = {'A', 'B', 'C', 'D', 'F'};

    //Constructor of ReportCard without any parameters
    public ReportCard(){
        //Initialize variables
        mStudentName = "";
        mEnglishGrade = ' ';
        mHistoryGrade = ' ';
        mMathGrade = ' ';
        mScienceGrade = ' ';
    }

    //Constructor given a student name parameter
    public ReportCard(String studentName){
        mStudentName = studentName;
        mEnglishGrade = ' ';
        mHistoryGrade = ' ';
        mMathGrade = ' ';
        mScienceGrade = ' ';
    }

    //Returns Student Name
    public String getStudentName(){
        return mStudentName;
    }

    //Returns English Grade for given student
    public char getEnglishGrade(){
        return mEnglishGrade;
    }

    //Returns History Grade for given student
    public char getHistoryGrade(){
        return mHistoryGrade;
    }

    //Returns Math Grade for given student
    public char getMathGrade(){
        return mMathGrade;
    }

    //Returns Science Grade for Given Student
    public char getScienceGrade(){
        return mScienceGrade;
    }

    //Sets the Student Name
    public String setStudentName(){
        return mStudentName;
    }

    //Sets the English Grade for given student.  Verifies against the list of valid grade
    public char setEnglishGrade(){
        return mEnglishGrade;
    }

    //Sets the History Grade for given student.  Verifies against the list of valid grade
    public char setHistoryGrade(){
        return mHistoryGrade;
    }

    //Sets the Math Grade for given student.  Verifies against the list of valid grade
    public char setMathGrade(){
        return mMathGrade;
    }

    //Sets the Science Grade for Given Student.  Verifies against the list of valid grade
    public char setScienceGrade(){
        return mScienceGrade;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
