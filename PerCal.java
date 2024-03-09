import java.lang.*;
import java.util.*;
class PerCal
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int noOfSub=s.nextInt();
        int a[]=new int[noOfSub];
        int totMar=0;
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the marks of the subject"+(i+1)+" out of 100 marks:");
            a[i]=s.nextInt();
            totMar+=a[i];
        }
        float avgMar=totMar/(float)noOfSub;
        System.out.println("The Total marks achieved in all subjects is "+totMar);
        System.out.println("The Average marks or percentage obtained is "+avgMar);
        if(avgMar>=90)
        {
            System.out.println("Obatined Grade is A+");
        }
        else if(avgMar>=80 && avgMar<90)
        {
            System.out.println("Obtained Grade is A");
        }
        else if(avgMar>=70 && avgMar<80)
        {
            System.out.println("Obtained Grade is B");
        }
        else if(avgMar>=60 && avgMar<70)
        {
            System.out.println("Obtained Grade is C");
        }
        else if(avgMar>=50 && avgMar<60)
        {
            System.out.println("Obtained Grade is D");
        }
        else if(avgMar>=40 && avgMar<50)
        {
            System.out.println("Obtained Grade is E");
        }
        else{
            System.out.println("The student is fail");
        }
    }
}
