/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os_project_elionushi;
import java.util.Comparator;
/**
 *
 * @author Elio
 */
public class Process {
    
    private float process_burst_time;
    private String process_name;
    private float process_remained_time;
    public float uninterrupted_execution_time;
    
    Process(String process_name, float process_burst_time, float process_time)
    {
        this.process_name=process_name;
        this.process_burst_time=process_burst_time;  
        this.process_remained_time=process_time;
    }
    
    Process(String process_name, float process_burst_time, float process_time, float uninterrupted_execution_time)
    {       
        this.process_name=process_name;
        this.process_burst_time=process_burst_time;
        this.process_remained_time=process_time;
        this.uninterrupted_execution_time=uninterrupted_execution_time;
    }
    
    public void setProcessName(String name)
    {        
        this.process_name=name;      
    }
    
    public void setRemainedTime(float time)
    {        
        this.process_remained_time=time;        
    }
    
    public String getProcessName()
    {
        return this.process_name;        
    }
    
    public float getRemainedTime()
    {
        return this.process_remained_time;
    }
    
    public float getBurstTime()
    {
        return this.process_burst_time;
    }
    
     /*Comparator for sorting the list by process_burst_time*/
    public static Comparator<Process> process_burst_time_comparator = new Comparator<Process>() {

	public int compare(Process p1, Process p2) {
	   float burst_time1 = p1.getBurstTime();
	   float burst_time2 = p2.getBurstTime();

	   //ascending order
	   return Float.compare(burst_time1, burst_time2);
    }};
}
