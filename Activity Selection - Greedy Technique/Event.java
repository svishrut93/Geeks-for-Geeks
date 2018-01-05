package Greedy;

public class Event implements Comparable{

	String EventName ; 
	int start_time; 
	int end_time ; 
	
	
	public Event(String EventName , int st , int et )
	{
		this.EventName = EventName; 
		this.start_time = st ; 
		this.end_time = et ; 
	}
	

	 public String getEventName() {
		return EventName;
	}


	public void setEventName(String eventName) {
		EventName = eventName;
	}


	public int getStart_time() {
		return start_time;
	}


	public void setStart_time(int start_time) {
		this.start_time = start_time;
	}


	public int getEnd_time() {
		return end_time;
	}


	public void setEnd_time(int end_time) {
		this.end_time = end_time;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		int compare_end_time=((Event)o).getEnd_time();
        
        /* For Ascending order*/
        return this.end_time-compare_end_time;
		
	}

	
}
