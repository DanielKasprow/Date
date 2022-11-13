package zad3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;

public class DataDni {
	public static void main(String[] args) throws ParseException {
		Date todayDay = new Date();
		SimpleDateFormat pattern = new SimpleDateFormat("d-M-y");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj Date urodzenia: ");
		String dane = sc.nextLine();
		sc.close();
		try 
		{
		Date myDate = pattern.parse(dane);
		System.out.println("Zyjesz " + Math.abs((todayDay.getTime()-myDate.getTime())/(1000*60*60*24))+ " dni");		
		}
		catch(ParseException e) {System.out.print("B³¹d");}
	}
}