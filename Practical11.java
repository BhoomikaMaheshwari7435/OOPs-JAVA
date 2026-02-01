class Time{
	int hours, minutes;
	
	void setTime(int h, int m){
		hours = h;
		minutes = m;
	}
	void addTime(Time t1, Time t2){
		minutes = t1.minutes + t2.minutes;
		hours = t1.hours + t2.hours;
		
		if(minutes >= 60){
			hours = hours + (minutes/60);
			minutes = (minutes % 60);		
		}
	}
	
	void displayTime(){
		System.out.println("hours :"+ hours+" minutes :"+minutes);
	}
	
	public static void main(String[] args){
		System.out.println("\nBhoomika Maheshwari");
		System.out.println("240390107020\n");
		
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		
		t1.setTime(2,35);
		t2.setTime(2,40);
		System.out.print("Time-1: ");
		t1.displayTime();		
		System.out.print("Time-2: ");
		t2.displayTime();
		
		t3.addTime(t1,t2);
		System.out.print("Added Time : ");
		t3.displayTime();
	}
	
}