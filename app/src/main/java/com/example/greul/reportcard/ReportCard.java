package com.example.greul.reportcard;

public class ReportCard {

    //Constructor of ReportCard without any parameters
    public ReportCard(){
        String mStudentName = "";
        char mEnglishGrade = ' ';
        char mHistoryGrade = ' ';
        char mMathGrade = ' ';
        char mScienceGrade = ' ';
    }

    //Constructor given a student name parameter
    public ReportCard(String studentName){
        String mStudentName = studentName;
        char mEnglishGrade = ' ';
        char mHistoryGrade = ' ';
        char mMathGrade = ' ';
        char mScienceGrade = ' ';
    }
}
