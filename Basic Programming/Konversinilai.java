public class Konversinilai {
    public static void main(String[] args) {
        // input
        int studentScore = 80;
        String grade;

        //Process : Your Solution Code is Here
        if (studentScore >= 80 && studentScore <= 100){
            grade = "A";
        }
        else if (studentScore >= 65 && studentScore <= 79){
            grade = "B+";
        }
        else if (studentScore >= 50 && studentScore <= 64){
            grade = "B";
        }
        else if (studentScore >= 35 && studentScore <= 49){
            grade = "C";
        }
        else if (studentScore >= 0 && studentScore <= 34){
            grade = "D";
        }
        else {
            grade = "invalid";
        }

        // output
        System.out.println("Nilainya adalah: "+grade);
}
}
