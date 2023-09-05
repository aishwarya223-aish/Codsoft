import java.util.*;

public class Studentcalculator {
   public static void main(String[] args) {
      int numOfSubjects = 6; // Number of subjects
      float[] marks = new float[numOfSubjects];
      float totalMarks = 0, averagePercentage;

      Scanner scanner = new Scanner(System.in);

      // Input marks for each subject
      System.out.println("Enter Marks Obtained in " + numOfSubjects + " Subjects:");
      for (int i = 0; i < numOfSubjects; i++) {
         marks[i] = scanner.nextFloat();
         totalMarks += marks[i];
      }

      // Calculate average percentage
      averagePercentage = (totalMarks / (numOfSubjects * 100)) * 100;

      // Assign grade based on average percentage
      String grade;
      if (averagePercentage >= 94) {
         grade = "A";
      } else if (averagePercentage >= 90) {
         grade = "A-";
      } else if (averagePercentage >= 87) {
         grade = "B+";
      } else if (averagePercentage >= 83) {
         grade = "B";
      } else if (averagePercentage >= 80) {
         grade = "B-";
      } else if (averagePercentage >= 77) {
         grade = "C+";
      } else if (averagePercentage >= 73) {
         grade = "C";
      } else if (averagePercentage >= 70) {
         grade = "C-";
      } else if (averagePercentage >= 67) {
         grade = "D+";
      } else if (averagePercentage >= 63) {
         grade = "D";
      } else if (averagePercentage >= 60) {
         grade = "D-";
      } else {
         grade = "F";
      }

      // Display results
      System.out.println("\nTotal Marks: " + totalMarks);
      System.out.println("Average Percentage: " + averagePercentage);
      System.out.println("Grade: " + grade);

      scanner.close();
   }
}