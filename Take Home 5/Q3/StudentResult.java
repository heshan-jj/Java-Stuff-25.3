package Q3;

public class StudentResult {
    int studentID;
    String studentName;
    int mathMark, scienceMark, englishMark;

    StudentResult(int studentID, String studentName, int mathMark, int scienceMark, int englishMark){
        this.studentID = studentID;
        this.studentName = studentName;
        this.mathMark = mathMark;
        this.scienceMark = scienceMark;
        this.englishMark = englishMark;
    }
    int getAverage(){
        return (mathMark + scienceMark + englishMark) / 3;
    }
    String getGrade(){
        int average = getAverage();
        if(average >= 75){
            return "A";
        } else if(average >= 60){
            return "B";
        } else if(average >= 50){
            return "C";
        } else if(average >= 35){
            return "D";
        } else {
            return "F";
        }
    }
    void updateMark(int newmark, String subject){
        if (subject == "maths"){
            mathMark = newmark;
        } else if (subject == "english"){
            englishMark = newmark;
        }else{
            scienceMark = newmark;
        }
    }
    String getResultsheet(){
        return "Student ID: " + studentID + "\n" +
                "Student Name: " + studentName + "\n" +
                "Math    Mark: " + mathMark + "\n" +
                "Science Mark: " + scienceMark + "\n" +
                "English Mark: " + englishMark + "\n" +
                "Average Mark: " + getAverage() + "\n" +
                "Grade: " + getGrade();
    }
}
