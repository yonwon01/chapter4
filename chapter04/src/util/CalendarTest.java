package util;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal =Calendar.getInstance();//팩토리 패턴 .->직접 new하지않고 팩토리 메쏘드 사용하는것.
		printDate(cal);
		Calendar cal2= Calendar.getInstance();
		cal2.set(Calendar.YEAR, 2007);
	    cal2.set(Calendar.MONTH,10);//-1
	    cal2.set(Calendar.DATE,12);
	    
	    cal2.add(Calendar.DATE, 100);
	    printDate(cal2);
	    
	}
	public static void printDate(Calendar cal) {
		
		String[] days= {"일","월","화","수","목","금","토"};
		int year=cal.get(Calendar.YEAR);
		//0~11
		int month=cal.get(Calendar.MONTH);
		int date=cal.get(Calendar.DATE);
		//1(일)~7(토)
		int day=cal.get(Calendar.DAY_OF_WEEK);
		int am=cal.getMaximum(Calendar.AM_PM);
		
		int hour=cal.get(Calendar.HOUR);
		int second =cal.get(Calendar.SECOND);
		
		
		System.out.println(days[day-1]);
		
		
	}

}
