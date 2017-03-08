package dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.lang3.time.DateUtils;

public class DateRepresentations {

	// oldest old school, ParseException necessary
	public static Date date() throws ParseException {
		return new SimpleDateFormat( "dd.MM.yyyy" ).parse( "08.03.2017" );
	}
	
	// variation with Apache Commons 3.5, also needs ParseException
	public static Date date_commons() throws ParseException {
		return DateUtils.parseDate("08.03.2017", "dd.MM.yyyy" );
	}
	
	// still old school
	public static Calendar calendar() {
		return new GregorianCalendar(2017, Calendar.MARCH, 8);
	}
	
	// Java 8
	public static LocalDate localdate() {
		return LocalDate.of(2017, Month.MARCH, 8);
	}
	
	// convert Date to LocalDate
	public static LocalDate convert(Date date) {

		// 1. Convert Date -> Instant.
        // 2. Instant + system default time zone + toLocalDate() = LocalDate.
		// Better encapsulate this stuff in some util method.
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	// convert Calendar to LocalDate
	public static LocalDate convert(Calendar cal) {
		return cal.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
}
