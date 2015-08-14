package conversions;

/**
 * Class that helps you convert distances
 * @author Dylan Richards
 * @version 1.0
 */
public class DistanceConversions {

	// From yards
	public static double yardstofeet(double yards) {
		return yards * 3;
	}

	public static double yardstoinches(double yards) {
		return yards * 36;
	}

	public static double yardstokilometers(double yards) {
		return  yards / 1093.61329833770785;
	}

	public static double yardstometers(double yards) {
		return yards * 0.9144;
	}

	public static double yardstocentimeters(double yards) {
		return yards * 91.44;
	}

	public static double yardstomillimeters(double yards) {
		return yards * 914.4;
	}

	public static double yardstomiles(double yards) {
		return yards / 1760;
	}

	// From feet
	public static double feettoyards(double feet) {
		 return feet / 3;
	}

	public static double feettoinches(double feet) {
		 return feet * 12;
	}

	public static double feettokilometers(double feet) {
		 return feet / 3280.83989501312342;
	}

	public static double feettometers(double feet) {
		 return feet * 0.3048;
	}

	public static double feettocentimeters(double feet) {
		 return feet * 30.48;
	}

	public static double feettomillimeters(double feet) {
		 return feet * 304.8;
	}

	public static double feettomiles(double feet) {
		 return feet / 5280;
	}

	// From inches
	public static double inchestoyards(double inches) {
		 return inches / 36;
		
	}

	public static double inchestofeet(double inches) {
		 return inches / 12;
	}

	public static double inchestokilometers(double inches) {
		 return inches / 39370.0787401574887;
	}

	public static double inchestometers(double inches) {
		 return  inches / 39.3700787401574823;
	}

	public static double inchestocentimeters(double inches) {
		 return inches * 2.54;
	}

	public static double inchestomillimeters(double inches) {
		 return inches * 25.4;
	}

	public static double inchestomiles(double inches) {
		 return inches / 63360;
	}

	// From kilometers
	public static double kilometerstoyards(double kilometers) {
		 return kilometers * 1093.6132983377;
	}

	public static double kilometerstofeet(double kilometers) {
		 return kilometers * 3280.8398950131233;
	}

	public static double kilometerstoinches(double kilometers) {
		 return kilometers * 39370.078740157481;
	}

	public static double kilometerstometers(double kilometers) {
		 return kilometers * 1000;
	}

	public static double kilometerstocentimeters(double kilometers) {
		 return kilometers * 100000;
	}

	public static double kilometerstomillimeters(double kilometers) {
		 return kilometers * 1000000;
	}

	public static double kilometerstomiles(double kilometers) {
		 return kilometers / 1.609344;
	}

	// From meters
	public static double meterstoyards(double meters) {
		 return meters * 1.0936132983377078272;
	}

	public static double meterstofeet(double meters) {
		 return meters * 3.28083989501312303;
	}

	public static double meterstoinches(double meters) {
		 return meters * 39.3700787401574842;
	}

	public static double meterstokilometers(double meters) {
		return meters / 1000;
	}

	public static double meterstocentimeters(double meters) {  
		return meters * 100;
	}

	public static double meterstomillimeters(double meters) {
		 return meters * 1000;	
	}

	public static double meterstomiles(double meters) {
		 return meters / 1609.344;
	}

	// From Centimeters
	public static double centimeterstoyards(double centimeters) {
		 return centimeters / 91.44;
	}

	public static double centimeterstofeet(double centimeters) {
		 return centimeters / 30.48;
	}

	public static double centimeterstoinches(double centimeters) {
		 return centimeters / 2.54;
	}

	public static double centimeterstokilometers(double centimeters) {
		 return centimeters / 100000;
	}

	public static double centimeterstometers(double centimeters) {
		 return centimeters / 100;
	}

	public static double centimeterstomillimeters(double centimeters) {
		 return centimeters * 10;
	}

	public static double centimeterstomiles(double centimeters) {
		 return centimeters / 160934;
	}

	// From millimeters
	public static double millimeterstoyards(double millimeters) {
		 return millimeters / 914.4;
	}

	public static double millimeterstofeet(double millimeters) {
		 return millimeters / 304.8;
	}

	public static double millimeterstoinches(double millimeters) {
		 return millimeters / 25.4;
	}

	public static double millimeterstokilometers(double millimeters) {
		 return millimeters / 1000000;
	}

	public static double millimeterstometers(double millimeters) {
		 return millimeters / 1000;	
	}

	public static double millimeterstocentimeters(double millimeters) {
		return millimeters / 10;
	}

	public static double millimeterstomiles(double millimeters) {
		 return millimeters / 1609340;
	}

	// From miles
	public static double milestoyards(double miles) {
		 return miles * 1760;
	}

	public static double milestofeet(double miles) {
		 return miles * 5280;
	}

	public static double milestoinches(double miles) {
		 return miles * 63360;
	}

	public static double milestokilometers(double miles) {
		 return miles * 1.609344;
	}

	public static double milestometers(double miles) {
		 return miles * 1609.344;
	}

	public static double milestocentimeters(double miles) {
		 return miles * 1609344;
	}

	public static double milestomillimeters(double miles) {
		  return miles * 1609344;
	}

}
