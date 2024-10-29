package Codsoft;
import java.util.*;

public class GradeCalculator {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of subjects : ");
    int subjects=sc.nextInt();
    int totalMarks=0;
    for(int i=1;i<=subjects;i++) {
        System.out.println("Enter marks of subject " + i + " out of 100 :");
        int subMarks = sc.nextInt();
        totalMarks +=subMarks;
    }
    System.out.println("Total marks obtained : "+ totalMarks);
    double average=(double)totalMarks/subjects;
    System.out.println("The average percent scored is : " + average);
    if(average>90 && average<=100){
        System.out.println("Grade = A+");
    }
    else if(average>80 && average<=90){
        System.out.println("Grade = A");
    }
    else if(average>70 && average<=80){
        System.out.println("Grade = B+");
    }
    else if(average>60 && average<=70){
        System.out.println("Grade = B");
    }
    else if(average>50 && average<=60){
        System.out.println("Grade = C+");
    }
    else if(average>40 && average<=50){
        System.out.println("Grade = C");
    }
    else if(average>33 && average<=40){
        System.out.println("Grade = D");
    }
    else{
        System.out.println("Grade = F");
    }

}
}
