package assignment;

class MyDate{
	private int day;
	private int month; 
	private int year;
	public static final String[] MONTHS = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug",
			"Sep","Oct","Nov","Dec"};
	public static final String[] DAYS = {"Sunday","Monday","Tuesday","Wednesday","Thursday",
			"Friday","Saturday"};
	public static final int[] DAYS_IN_MONTHS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static boolean isLeapYear(int year) {
		if(year%400 == 0 || (year%4 == 0 && year%100 != 0))
			return true;
		return false;
	}
	public static boolean isValidDate(int year, int month, int day) {
		if(year >=1 && year <= 9999) {
			if(isLeapYear(year) && month == 2)
				if(day >= 1 && day <= 29)
					return true;
			else if(month == 2 && day>=1 && day <=28)
				return true;
			else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || 
					month==12)
				if(day>=1 && day <= 31)
					return true;
			else if(month==4 || month==6 || month==9 || month==11)
				if(day>=1 && day<=30)
					return true;
		}
		return false;
	}
	public String getWeekDay() {
		return DAYS[getDayOfWeek(year, month, day)];
	}
	public static int getDayOfWeek(int year, int month, int day) {
		int yy = year%100;
		int yc = (yy+(yy/4))%7;
		int[] mc = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
		int cc;
		if(year>=1 && year <1752)
			cc = (18-(year/100))%7;
		else if(year>=1752 && year<1800)
			cc = 4;
		else if(year>=1800 && year<1900)
			cc = 2;
		else if(year>=1900 && year<2000)
			cc = 0;
		else if(year>=2000 && year<2100)
			cc = 6;
		else if(year>=2100 && year<2200)
			cc = 4;
		else if(year>=2200 && year<2300)
			cc = 2;
		else
			cc = 0;
		int lc = (isLeapYear(year)&&(month==1||month==2))?1:0;
		return (yc + mc[month-1] + cc + day - lc)%7;
	}
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setDate(int year, int month, int day) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toString() {
		return DAYS[getDayOfWeek(this.year, this.month, this.day)]+ " " + day + " " 
				+ MONTHS[this.month-1] + " " + this.year;
	}
	public MyDate nextDay() {
		if(this.day == 31 && this.month == 12) {
			this.day = 1; this.month = 1; this.year += 1;
		}
		else if(this.day == 31 && (this.month==1 || this.month==3 || this.month==5 || 
				this.month==7 || this.month==8 || this.month==10)) {
			this.day = 1; this.month += 1;
		}
		else if(this.day == 30 && (this.month==4 || this.month==6 || this.month==9 || 
				this.month==11)) {
			this.day = 1; this.month += 1;
		}
		else if((this.day==28 && this.month==2)||(this.day==29 && this.month==2)) {
			this.day = 1; this.month += 1;
		}
		else
			this.day += 1;
		return this;			
	}
	public MyDate nextMonth() {
		if(this.month == 12) {
			this.month = 1; this.year += 1;
		}
		else 
			this.month += 1;
		return this;
	}
	public MyDate nextYear() {
		this.year += 1;
		return this;
	}
	public MyDate previousDay() {
		if(this.day == 1 && this.month == 1) {
			this.day = 31; this.month = 12; this.year -= 1;
		}
		else if(this.day==1 && this.month==3 && isLeapYear(this.year)) {
			this.day = 29; this.month -= 1;
		}
		else if(this.day==1 && this.month==3 && !isLeapYear(this.year)) {
			this.day = 28; this.month -= 1;
		}
		else if(this.day == 1 && (this.month==5 || this.month==7 || this.month==8 || 
				this.month==10 || this.month==12)) {
			this.day = 30; this.month -= 1;
		}
		else if(this.day == 1 && (this.month==4 || this.month==6 || this.month==9 || 
				this.month==11)) {
			this.day = 31; this.month -= 1;
		}
		else
			this.day -= 1;
		return this;
	}
	public MyDate previousMonth() {
		if(this.month == 1) {
			this.month = 12; this.year -= 1;
		}
		else
			this.month -= 1;
		return this;
	}
	public MyDate previousYear(){
		this.year -= 1;
		return this;
	}
}

public class MyDateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate md = new MyDate(8, 4, 1994);
		System.out.println(md);
		System.out.println(md.getWeekDay());
		System.out.println(MyDate.isValidDate(2021, 2, 29));
		System.out.println(MyDate.isLeapYear(8000));
		md.setDate(1996, 2, 5);
		System.out.println(md);
		MyDate md1 = new MyDate(31, 12, 1990);
		System.out.println(md1.nextDay());
		System.out.println(md1.previousMonth());
		System.out.println(md1.nextYear());
		System.out.println(md1.previousYear().previousYear());
		MyDate md2 = new MyDate(29, 2, 2020);
		System.out.println(md2.nextDay());
		System.out.println(md2.previousDay().previousDay());
	}

}
