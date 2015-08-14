package conversions;

/**
 * Class that helps you convert Time
 * @author Dylan Richards
 * @version 1.0
 */
public class TimeConversions {
	
	//From Days
	public static double daystohour(double number) {
		return number * 24;
	}

	public static double daystominute(double number) {
		return number * 1440;
	}

	public static double daystosecond(double number) {
		return number * 86400;
	}

	public static double daystomillisecond(double number) {
		return number * 86400000;
	}

	//From hours
	public static double hourstodays(double number) {
		return number / 24;
	}

	public static double hourstominute(double number) {
		return number * 60;
	}

	public static double hourstosecond(double number) {
		return number * 3600;
		
	}

	public static double hourstomillisecond(double number) {
		return number * 3600000;
	}

	//From Minutes
	public static double minutestodays(double number) {
		return number / 1440;
	}

	public static double minutestohour(double number) {
		return number / 60;
	}

	public static double minutestosecond(double number) {
		return number * 60;
	}

	public static double minutestomillisecond(double number) {
		return number * 60000;
	}

	//From Seconds
	public static double secondstodays(double number) {
		return number / 86400;
	}

	public static double secondstohour(double number) {
		return number / 3600;
	}

	public static double secondstominute(double number) {
		return number / 60;
	}

	public static double secondstomillisecond(double number) {
		return number * 1000;
	}

	//From milliseconds
	public static double millisecondstodays(double number) {
		return number / 86400000;
	}

	public static double millisecondstohour(double number) {
		return number / 3600000;
	}

	public static double millisecondstominute(double number) {
		return number / 60000;
	}

	public static double millisecondstosecond(double number) {
		return number / 1000;
		
	}

}
