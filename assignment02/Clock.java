
public class Clock {
	
		private int day;
		private int hour;
		private int minute;
		private int second;
		public int getDay() {
			return day;
		}
		public Clock(int days, int hours,int minutes, int seconds) {
			this.day= days;
			this.hour= hours;
			this.minute= minutes;
			this.second=seconds;	
		}public Clock(){
			this(0, 0, 0, 0);
		}
		public void increment(int seconds) {
			int a = this.second+seconds;
			int y=0;
			if(a>59) {
			this.second= a%60;
			this.minute+=1;}
			else {
				this.second=a;}
			if(this.minute>59) {
				this.minute=this.minute%60;
				this.hour+=1;}
			else {
				this.minute+=0;}
			
			if(this.hour>23) {
				this.hour=this.hour%24;
				this.day+=1;}
			else {
				this.hour+=0;}
			this.day=this.day+y;	
		}public int calculateTotalSeconds() {
			int t =(this.day*24*60*60)+(this.hour*60*60)+(this.minute*60)+(this.second);
			return t;
			
		}
		public void setDay(int day) {
			this.day = day;
		}
		public int getHour() {
			return hour;
		}
		public void setHour(int hour) {
			this.hour = hour;
		}
		public int getMinute() {
			return minute;
		}
		public void setMinute(int minute) {
			this.minute = minute;
		}
		public int getSecond() {
			return second;
		}
		public void setSecond(int second) {
			this.second = second;
		}
		public static void main(String[] args) {
			// Create elapsed time with the default values of zeros for day, hour,
			// minute and second.
			Clock t1 = new Clock(); // Default constructor
			// sets hour to 23
			t1.setHour(23);
			// sets day to 1
			t1.setDay(1);
			// sets minute to 59
			t1.setMinute(59);
			// sets day to 16
			t1.setSecond(16);
			// prints: 1:23:59:16
			System.out.println(t1.getDay() + ":" + t1.getHour() +":" + t1.getMinute() + ":" + t1.getSecond());
			// increments time t1 by 44 seconds:
			t1.increment(44);
			// prints: 2:0:0:0
			System.out.println(t1.getDay() + ":" + t1.getHour() +":" +t1.getMinute() + ":" + t1.getSecond());
			// prints the total elapsed time in seconds: 172,800
			System.out.printf("The elapsed time in seconds is: %d", t1.calculateTotalSeconds());
			System.out.println();
			// REPEAT SIMILAR TESTS FOR t2
			//Elapsed time is 3 days, 1 hour, 4 mins and 5 secs
			Clock t2 = new Clock(3, 1, 4, 5);
			System.out.println(t2.getDay() + ":" + t2.getHour() +":" + t2.getMinute() + ":" + t2.getSecond());
			// increments time t1 by 44 seconds:
			t2.increment(44);
			// prints: 2:0:0:0
			System.out.println(t2.getDay() + ":" + t2.getHour() +":" +t2.getMinute() + ":" + t2.getSecond());
			}
		}

	


