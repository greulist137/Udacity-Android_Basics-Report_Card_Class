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


}
