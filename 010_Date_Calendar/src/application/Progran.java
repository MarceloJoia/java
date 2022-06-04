package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Progran {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = Date.from(Instant.parse("2022-06-04T10:34:52Z"));
		System.out.println(sdf.format(data));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		//cal.add(Calendar.HOUR_OF_DAY, 4);
		//data = cal.getTime();
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);

		//System.out.println(sdf.format(data));
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}
}
