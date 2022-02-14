import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PrintDate {
	public static void main(String[] args) {
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		Calendar datetwo = simpleDateFormat.getCalendar();
		System.out.println(date);
		System.out.println(datetwo);

	}
}
