import java.util.Scanner;
public class task2 {
    static float sum = 0;
    static char grade = ' ';

    static float calcAverage(int[] marks){

        for(int n =0; n<marks.length;n++){
            sum += marks[n];
        }
        float average = sum/marks.length;
        return average;

    }
    static char provideGrade(float ans){
        if(ans>70.0){
            grade = 'A';
        }
        else if(ans<70.0 && ans>55.0){
            grade = 'B';
        }
        else if(ans<55.0 && ans>33.0){
            grade = 'C';
                
        }else{
            grade = 'F';
        }
        return grade;
    }

    public static void main(String args[]){
        int[] marks = new int[6];
        System.out.println("ENTER MARKS(OUT OF 100) OF A STUDENT IN THE FOLLOWING ORDER:");
        System.out.println("PHYSICS,CHEMISTRY,MATHS,COMPUTER SCIENCE,PHYSICAL EDUCATION,ENGLISH");
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<marks.length;i++){
            System.out.print("ENTER MARKS:");
            marks[i] = sc.nextInt();
        } 
        float PERCENT =calcAverage(marks);
        char grade_final = provideGrade(PERCENT); 
        System.out.println("TOTAL MARKS OUT OF 600:"+sum); 
        System.out.println("PERCENATGE:"+PERCENT);
        System.out.println("GRADE:"+grade_final);
        

    }
    
}
