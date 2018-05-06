package com.example.greul.reportcard;

public class ReportCard {

    //Declare Variables
    private String mStudentName = "";
    private char mEnglishGrade = ' ';
    private char mHistoryGrade = ' ';
    private char mMathGrade = ' ';
    private char mScienceGrade = ' ';

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


}
