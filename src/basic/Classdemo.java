package basic;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class Classdemo {

	public static void main(String[] args) {
	//	System.out.println(new Date());
//		Date date = new Date();
//		String datestr = date.toString();
//		System.out.println(datestr);
		
//		LocalDate localdate = LocalDate.now();
//		int day = localdate.getDayOfYear();
//		System.out.println(day);
//		LocalDate birthday = LocalDate.of(1994, 3, 10);
//		System.out.println(birthday.toString());
//		LocalDate newdate = birthday.plusDays(1000);
//		System.out.println(newdate.toString());
		

		//显示当月日历
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
		date = date.minusDays(today-1);
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();
		
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for(int i =1;i<value;i++){
			System.out.print("   ");
		}
		while(date.getMonthValue() == month){
			System.out.printf("%3d",date.getDayOfMonth());
			if(date.getDayOfMonth() == today){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
			date = date.plusDays(1);
			if(date.getDayOfWeek().getValue()==1)
			{
				System.out.println();
			}
		}
	}

}
