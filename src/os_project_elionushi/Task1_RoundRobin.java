/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os_project_elionushi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
/*
public class Task1_RoundRobin {
    
    public static void main(String args[])
    {
        while(true)
{     
    try
       {
       System.out.println("*************************************************************************************************************");
       ArrayList<Process> process=new ArrayList<Process>();
       ArrayList<Process> processclone=new ArrayList<Process>();
       ArrayList<Process> executionTimeLine=new ArrayList<Process>();
       int flag=1;
       float time;
       String name;
       float AVG_TAT=0;
       float AVG_WT=0;
       float timequanta=4;
       Scanner input=new Scanner(System.in);
       System.out.println("This program prompts the user to enter processes: Their names and their respective");
       System.out.println("burst times. Then it calculates the order of execution, the waiting times, turn around");
       System.out.println("times and average WT and TAT for each entered process according to Round Robin algorithm.\n\n");
       
       while(flag==1)
       {  
         
          System.out.println("Enter the name of the process(the name should not contain any spaces):");
          name=input.next();
          System.out.println("Enter the burst time of the process:");
          time=input.nextFloat();
          Process a=new Process(name,time,time);
          process.add(a);
          processclone.add(a);
          System.out.println("Press 1 if you want to enter another process or 2 if you want to stop here and see the results.");
          flag=input.nextInt();
       }
        
       while (process.size()>0)
       {
           for(int i=0;i<process.size();i++)
           {
               if(process.get(i).getRemainedTime()-timequanta>=0)
               {
                   process.get(i).setRemainedTime(process.get(i).getRemainedTime()-timequanta);
                   process.get(i).uninterrupted_execution_time=timequanta;
                   Process p= new Process(process.get(i).getProcessName(),process.get(i).getRemainedTime(),process.get(i).getBurstTime(),process.get(i).uninterrupted_execution_time);
                   executionTimeLine.add(p);
               }
               else // when the following block is executed it means that the remained time of the Process is 
                    //smaller than the time quanta. Therefore the Process will terminate after the following block is terminated.
               {
                   
                   if(process.get(i).getRemainedTime()==0)
                   { 
                       process.remove(i);
                       i--;
                   }   
                   else
                   {
                   process.get(i).uninterrupted_execution_time=process.get(i).getRemainedTime();
                   Process p= new Process(process.get(i).getProcessName(),process.get(i).getRemainedTime(),process.get(i).getBurstTime(),process.get(i).uninterrupted_execution_time);
                   executionTimeLine.add(p);
                   process.remove(i);
                   i--;
                   }
               }    
           }
       }
       
     int[] lastoccurrence = new int [processclone.size()];
     float[] turnaroundtime= new float [processclone.size()];
     float[] waitingtime= new float [processclone.size()];
 
        for(int i=0;i<processclone.size();i++)
    {
        for(int j=executionTimeLine.size()-1;j>=0;j--)
            if(processclone.get(i).getProcessName().equals(executionTimeLine.get(j).getProcessName()))
            {lastoccurrence[i]=j;
            break;}                    
    }
    
       for(int i=0;i<processclone.size();i++)
    {
        float TA=0;
        float WT=0;
        for(int j=lastoccurrence[i];j>=0;j--)
        {
            TA=TA+executionTimeLine.get(j).uninterrupted_execution_time;
            if(executionTimeLine.get(j).getProcessName().equals(processclone.get(i).getProcessName())==false)
            WT=WT+executionTimeLine.get(j).uninterrupted_execution_time;         
        } 
        turnaroundtime[i]=TA;
        waitingtime[i]=WT;
    }   
       
    System.out.println("****************************************************Results**************************************************");   
    System.out.println("Order of execution:");
       
       for(int i=0;i<executionTimeLine.size();i++)
       {             
           System.out.println(executionTimeLine.get(i).getProcessName()+"("+Math.round(executionTimeLine.get(i).uninterrupted_execution_time)+")");           
       }
     
    System.out.println("Waiting times:");
      
       for(int i=0;i<processclone.size();i++)
       {              
           System.out.println(processclone.get(i).getProcessName()+"="+Math.round(waitingtime[i]));           
       }
          
     System.out.println("Turn around times:");
      
       for(int i=0;i<processclone.size();i++)
       {              
           System.out.println(processclone.get(i).getProcessName()+"="+Math.round(turnaroundtime[i]));           
       }
       
       for(int i=0;i<processclone.size();i++)
       {              
           AVG_TAT=AVG_TAT+turnaroundtime[i]; 
           AVG_WT=AVG_WT+waitingtime[i];
       }
     System.out.printf("AVG TAT=%.2f \n", AVG_TAT/processclone.size());
     System.out.printf("AVG WT=%.2f \n", AVG_WT/processclone.size());
       
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