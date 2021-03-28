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
		Date d1 = new Date();
		SimpleDateFormat df1 = new SimpleDateFormat("d-M-y");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj Date urodzenia: ");
		String dane = sc.nextLine();
		sc.close();
		Date d2 = df1.parse(dane);
		
		//long daysBetween = DAYS.between(d1, d2);
		
		//long daysBetween = ChronoUnit.DAYS.between(d1, d2);
		System.out.println("Zyjesz " + Math.abs((d1.getTime()-d2.getTime())/(1000*60*60*24))+ " dni");		
	}
}