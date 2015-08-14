package conversions;

/**
 * Class that helps you convert Temperature
 * @author Dylan Richards
 * @version 1.0
 */
public class TemperatureConversions {

	// From fahrenheit
	public static double fahrenheittocelsius(double number) {
		return (number - 32) * 5 / 9;
	}

	public static double fahrenheittokelvin(double number) {
		return (number + 459.67) / 1.8;
	}

	// From celsius
	public static double celsiustofahrenheit(double number) {
		return number * 9 / 5 + 32;
	}

	public static double celsiustokelvin(double number) {
		return number + 273.15;
	}

	// From kelvin
	public static double kelvintofahrenheit(double number) {
		return number * 1.8 - 459.67;
	}

	public static double kelvintocelsius(double number) {
		return number - 273.15;	
	}

}
