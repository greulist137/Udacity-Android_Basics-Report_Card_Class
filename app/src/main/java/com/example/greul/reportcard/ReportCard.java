package com.example.greul.reportcard;

public class ReportCard {

    //Declare Variables
    private String mStudentName = "";
    private char mEnglishGrade = ' ';
    private char mHistoryGrade = ' ';
    private char mMathGrade = ' ';
    private char mScienceGrade = ' ';
    private char[] validGrades = {'A', 'B', 'C', 'D', 'F'};
    private boolean isValidGrade = false;
    private String reportCard;

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
    public void setStudentName(String name){
        mStudentName = name;
        reportCard += "Student Name: " + mStudentName + "\n";
    }

    //Sets the English Grade for given student.  Verifies against the list of valid grade
    public void setEnglishGrade(char grade){
        isValidGrade = checkValidGrade(grade);
        if (isValidGrade == true){
            reportCard += "English: " + grade + "\n";
        }
        isValidGrade = false;
    }

    //Sets the History Grade for given student.  Verifies against the list of valid grade
    public void setHistoryGrade(char grade){
        isValidGrade = checkValidGrade(grade);
        if (isValidGrade == true){
            reportCard += "History: " + grade + "\n";
        }
        isValidGrade = false;
    }

    //Sets the Math Grade for given student.  Verifies against the list of valid grade
    public void setMathGrade(char grade){
        isValidGrade = checkValidGrade(grade);
        if (isValidGrade == true){
            reportCard += "Math: " + grade + "\n";
        }
        isValidGrade = false;
    }

    //Sets the Science Grade for Given Student.  Verifies against the list of valid grade
    public void setScienceGrade(char grade){
        isValidGrade = checkValidGrade(grade);
        if (isValidGrade == true){
            reportCard += "Science: " + grade + "\n";
        }
        isValidGrade = false;
    }

    //The purpose of this method is to check the parameter against valid grade.
    public boolean checkValidGrade(char grade){
        for (int x = 0; x < validGrades.length; x++){
            if(grade == x){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return reportCard;
    }
}
