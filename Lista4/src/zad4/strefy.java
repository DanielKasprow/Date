package zad4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class strefy {
	public static void main(String[] args) throws ParseException {

		TimeZone timeZone1 = TimeZone.getTimeZone("America/Detroit");
		TimeZone timeZone2 = TimeZone.getTimeZone("Asia/Tokyo");	
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj Date urodzenia: ");
		String dane = sc.nextLine();
		sc.close();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy h:m");		
		Date date = simpleDateFormat.parse(dane + " 13:00");

		int differenceTimeInhours = 0;

		differenceTimeInhours += Math.abs(timeZone2.getRawOffset() / (1000 * 60 * 60) - timeZone1.getRawOffset() / (1000 * 60 * 60));

		if (timeZone1.inDaylightTime(date) != timeZone2.inDaylightTime(date)) {
			if (timeZone1.getRawOffset() / (1000 * 60 * 60) > timeZone2.getRawOffset() / (1000 * 60 * 60)) {
				if (timeZone1.inDaylightTime(date) == true)
					differenceTimeInhours++;
				else
					differenceTimeInhours--;
			}
			else
			{
				if (timeZone2.inDaylightTime(date) == true)
					differenceTimeInhours++;
				else
					differenceTimeInhours--;
			}
		}

		System.out.println(timeZone1.inDaylightTime(date));
		System.out.println(timeZone2.inDaylightTime(date));
		System.out.println(timeZone1.getDSTSavings() / (1000 * 60 * 60));
		System.out.println(timeZone2.getDSTSavings() / (1000 * 60 * 60));
		System.out.println("Roznica w czasie wynosi: " + differenceTimeInhours);
	}
}
