/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os_project_elionushi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
/*
public class Task1_FCFS {
          public static void main(String args[])
    {
        while(true)
{     
       try
       {
       System.out.println("*************************************************************************************************************");
       ArrayList<Process> process=new ArrayList<Process>();
       int flag=1;
       float time;
       String name;
       float AVG_TAT=0;
       float AVG_WT=0;
       Scanner input=new Scanner(System.in);
       System.out.println("This program prompts the user to enter processes: Their names and their respective");
       System.out.println("burst times. Then it calculates the order of execution, the waiting times, turn around");
       System.out.println("times and average WT and TAT for each entered process according to non-preemptive FCFS algorithm.\n\n");
       
       while(flag==1)
       {  
         
          System.out.println("Enter the name of the process(the name should not contain any spaces):");
          name=input.next();
          System.out.println("Enter the burst time of the process:");
          time=input.nextFloat();
          Process a=new Process(name,time,time);
          a.uninterrupted_execution_time=a.getBurstTime();
          process.add(a);
          System.out.println("Press 1 if you want to enter another process or 2 if you want to stop here and see the results.");
          flag=input.nextInt();
       }
     
     
     float[] turnaroundtime= new float [process.size()];
     float[] waitingtime= new float [process.size()];
 
    for(int i=0;i<process.size();i++)
    {
       float TA=0;
       float WT=0;
       //System.out.println("*");
       for(int j=i;j>=0;j--)
        {
         TA=TA+process.get(j).uninterrupted_execution_time;
         if(i==0)
         WT=0;     
         if(j==0)
         break;
         WT=WT+process.get(j-1).uninterrupted_execution_time;
         
        }
       waitingtime[i]=WT;
       turnaroundtime[i]=TA;
    }
       
    System.out.println("****************************************************Results**************************************************");   
    System.out.println("Order of execution:");
       
       for(int i=0;i<process.size();i++)
       {             
           System.out.println(process.get(i).getProcessName()+"("+Math.round(process.get(i).uninterrupted_execution_time)+")");           
       }
     
    System.out.println("Waiting times:");
      
       for(int i=0;i<process.size();i++)
       {              
           System.out.println(process.get(i).getProcessName()+"="+Math.round(waitingtime[i]));           
       }
          
     System.out.println("Turn around times:");
      
       for(int i=0;i<process.size();i++)
       {              
           System.out.println(process.get(i).getProcessName()+"="+Math.round(turnaroundtime[i]));           
       }
       
       for(int i=0;i<process.size();i++)
       {              
           AVG_TAT=AVG_TAT+turnaroundtime[i]; 
           AVG_WT=AVG_WT+waitingtime[i];
       }
     System.out.printf("AVG TAT=%.2f \n", AVG_TAT/process.size());
     System.out.printf("AVG WT=%.2f \n", AVG_WT/process.size());
       
    System.out.println("****************************************************Results**************************************************");
       }
       catch(Exception e)
       {
           e.printStackTrace();
           System.out.println("An Error Occurred possibly because of wrong input: Reenter Data");
       }
}
    
}

}
*/