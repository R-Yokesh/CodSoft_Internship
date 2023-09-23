import java.util.*;

class Stu_marks_Calc
{
    public static void main(String[]args)
    {
        System.out.println("***---Student Marks Calculator---***");
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of Subjects :");
        int sub = sc.nextInt();
        int marks[] = new int[sub];
        
        System.out.print("Enter the Marks:");
        
        for (int i=0;i<sub;i++)
        {
            marks[i] = sc.nextInt();
            //System.out.print(marks[i]);
        }
        int total = 0;
        for(int i=0;i<marks.length;i++) 
        {
            total += marks[i];          
        }
        System.out.println("Total marks:" + total);
        
        double average = total/sub ;
        
        System.out.println("Average marks obtained:" + average);
        
        if(average >= 90)
        {
			System.out.println("Excellent: Grade A");
		}
		else if(average < 90 && average >= 80)
		{
			System.out.println("Very Good: Grade B");
		}
		else if(average < 80 && average >= 70)
		{
			System.out.println("Good: Grade C");
		}
		else if(average < 70 && average >= 60)
		{
			System.out.println("Satisfactory: Grade D");
		}
		else if(average < 60 && average >= 50)
		{
			System.out.println("Work Hard: Grade E");
		}
		else if(average < 50 && average >= 40)
		{
			System.out.println("Just Passed: Grade F");
		}
		else 
		{
			System.out.println("Failed!");
			
			
        
        
    }
}
}

