import java.util.Scanner;
public class Scoregrade{
public static void main(String[] args){
        //initialize and declare variable
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;
        int i=1;
        int score;
        int grade=0;
        int total=0;
        double average;
        String exam="A";
      
        Scanner scan = new Scanner(System.in); 
        do {
        System.out.print("Enter score #"+i+" or negative value to STOP:");
        score = scan.nextInt();
        if (score>=0 && score<=100)
        {total+=score;
        grade++;
        //determine the score in each grade
        if(score>=90 && score<=100)
        A++;
        else if(score>=80 && score<=89)
        B++;
        else if(score>=70 && score<=79)
        C++;
        else if(score>=60 && score<=69)
        D++;
        else if(score>=0 && score<=59)
        F++;}
        //continue loop 
        if(score<=100)
        {i++;}
        else
        System.out.print("Invalid score!!\n0-100 ONLY or negative value to STOP.\n");
        }
        while (score>=0);//end do while
        //calculate average
        average=total/grade;
        //determine average grade
        if(average>=90 && average<=100)
        exam="A";
        else if(average>=80 && average<=89)
        exam="B";
        else if(average>=70 && average<=79)
        exam="C";
        else if(average>=60 && average<=69)
        exam="D";
        else if(average>=0 && average<=59)
        exam="F";
        
        //display output
         System.out.println("Number of A scorer: "+ A);
         System.out.println("Number of B scorer: "+ B);
         System.out.println("Number of C scorer: "+ C);
         System.out.println("Number of D scorer: "+ D);
         System.out.println("Number of F scorer: "+ F);
         System.out.println("Total number of scores entered:"+grade);
         System.out.println("Total Scores ="+ total);
         System.out.println("Average Score is "+average+" = "+exam);
        
 }//end main
}//end class
