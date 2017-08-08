package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//현재시간
		Date now = new Date();
		System.out.println(now.toString());
		printDate1(now);
		printDate2(now);
		
		
		//특정시간 세팅(2000/08/04)
		Date d1=new Date(100,7,4);
		printDate2(d1);
		
		//1970년 1월 1일 00:00:00기준
		//milliseconds값을 세팅
		Date d3=new Date(24*60*60*1000*365*30);
		
	}

	private static void printDate1(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
	}

	private static void printDate2(Date date) {
		//년도
		int year=date.getYear();//deprecated->곧없어진다고 쓰지말라는것
		//월(0~11)
		int month=date.getMonth();
		//일
		int day=date.getDate();
		//시간
		int hour=date.getHours();
		//분
		int minutes=date.getMinutes();
		//초
		int seconds=date.getSeconds();
		
		System.out.println((year+1900)+"년"+(month+1)+"월"+day+"일 "+hour+"시간"+minutes+"분"+seconds+"초");
	}
}
