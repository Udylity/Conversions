package conversions;

/**
 * Class that helps you convert Speeds
 * @author Dylan Richards
 * @version 1.0
 */
public class SpeedConversions {
	
	private static double kmph;

	// From miles per hour
	public static double milesperhourtomilesperminute(double number) {
		return number / 60;
	}

	public static double milesperhourtomilespersecond(double number) {
		return number / 3600;
	}

	public static double milesperhourtofeetperminute(double number) {
		return number * 88;
	}

	public static double milesperhourtofeetpersecond(double number) {
		return (number * 5280) / 3600;
	}

	public static double milesperhourtokilometersperhour(double number) {
		return number * 1.6093439987125;
	}

	public static double milesperhourtokilometersperminute(double number) {
		return number / 37.28;
	}

	public static double milesperhourtokilometerspersecond(double number) {
		return number * 0.00044704;
	}

	public static double milesperhourtometersperminute(double number) {
		return number * 26.82240002463369;
	}

	public static double milesperhourtometerspersecond(double number) {
		return number * 0.4470400004105615;
	}
	
	public static double milesperhourtoknots(double number){
		kmph = SpeedConversions.milesperhourtokilometersperhour(number);
		return SpeedConversions.kilometersperhourtoknots(kmph);
	}

	// Miles per minute
	public static double milesperminutetomilesperhour(double number) {
		return number * 60;
	}

	public static double milesperminutetomilespersecond(double number) {
		return number / 60;
	}

	public static double milesperminutetofeetperminute(double number) {
		return number * 5280;
	}

	public static double milesperminutetofeetpersecond(double number) {
		return number * 88;
	}

	public static double milesperminutetokilometersperhour(double number) {
		return number * 96.56064;
	}

	public static double milesperminutetokilometersperminute(double number) {
		return number * 1.609344;
	}

	public static double milesperminutetokilometerspersecond(double number) {
		return number * 0.0268224;
	}

	public static double milesperminutetometersperminute(double number) {
		return number * 1609.344;
	}

	public static double milesperminutetometerspersecond(double number) {
		return number * 26.8224;
	}
	
	public static double milesperminutetoknots(double number){
		kmph = SpeedConversions.milesperminutetokilometersperhour(number);
		return SpeedConversions.kilometersperhourtoknots(kmph);
	}

	// Miles per second
	public static double milespersecondtomilesperhour(double number) {
		return number * 3600;
	}

	public static double milespersecondtomilesperminute(double number) {
		return number * 60;
	}

	public static double milespersecondtofeetperminute(double number) {
		return number * 316800;
	}

	public static double milespersecondtofeetpersecond(double number) {
		return number * 5280;
	}

	public static double milespersecondtokilometersperhour(double number) {
		return number * 5793.6384;
	}

	public static double milespersecondtokilometersperminute(double number) {
		return number * 96.56064;
	}

	public static double milespersecondtokilometerspersecond(double number) {
		return number * 1.609344;
	}

	public static double milespersecondtometersperminute(double number) {
		return number * 96560.64;
	}

	public static double milespersecondtometerspersecond(double number) {
		return number * 1609.344;
	}
	
	public static double milespersecondtoknots(double number){
		kmph = SpeedConversions.milespersecondtokilometersperhour(number);
		return SpeedConversions.kilometersperhourtoknots(kmph);
	}

	// Feet per minute
	public static double feetperminutetomilesperhour(double number) {
		return number / 88;
	}

	public static double feetperminutetomilesperminute(double number) {
		return number / 5280;
	}

	public static double feetperminutetomilespersecond(double number) {
		return number / 316800;
	}

	public static double feetperminutetofeetpersecond(double number) {
		return number / 60;
	}

	public static double feetperminutetokilometersperhour(double number) {
		return number * 0.018288;
	}

	public static double feetperminutetokilometersperminute(double number) {
		return number * 0.0003048;
	}

	public static double feetperminutetokilometerspersecond(double number) {
		return number * 0.00000508;
	}

	public static double feetperminutetometersperminute(double number) {
		return number * 0.3048;
	}

	public static double feetperminutetometerspersecond(double number) {
		return number * 0.00508;
	}
	
	public static double feetperminutetoknots(double number){
		kmph = SpeedConversions.feetperminutetokilometersperhour(number);
		return SpeedConversions.kilometersperhourtoknots(kmph);
	}

	// Feet per second
	public static double feetpersecondtomilesperhour(double number) {
		return number * 0.68181818181818179584;
	}

	public static double feetpersecondtomilesperminute(double number) {
		return number / 88;
	}

	public static double feetpersecondtomilespersecond(double number) {
		return number / 5280;
	}

	public static double feetpersecondtofeetperminute(double number) {
		return number * 60;
	}

	public static double feetpersecondtokilometersperhour(double number) {
		return number * 1.09728;
	}

	public static double feetpersecondtokilometersperminute(double number) {
		return number * 0.018288;
	}

	public static double feetpersecondtokilometerspersecond(double number) {
		return number * 0.0003048;
	}

	public static double feetpersecondtometersperminute(double number) {
		return number * 18.28800;
	}

	public static double feetpersecondtometerspersecond(double number) {
		return number * 0.3048;
	}
	
	public static double feetpersecondtoknots(double number){
		kmph = SpeedConversions.feetpersecondtokilometersperhour(number);
		return SpeedConversions.kilometersperhourtoknots(kmph);
	}

	// Kilometers per hour
	public static double kilometersperhourtomilesperhour(double number) {
		return number * 0.6213711922373339136;
	}

	public static double kilometersperhourtomilesperminute(double number) {
		return number * 0.0103561865;
	}

	public static double kilometersperhourtomilespersecond(double number) {
		return number * 0.000172603109;
	}

	public static double kilometersperhourtofeetperminute(double number) {
		return number * 54.6806649;
	}

	public static double kilometersperhourtofeetpersecond(double number) {
		return number * 0.911344;
	}

	public static double kilometersperhourtokilometersperminute(double number) {
		return number / 60;
	}

	public static double kilometersperhourtokilometerspersecond(double number) {
		return number / 3600;
	}

	public static double kilometersperhourtometersperminute(double number) {
		return number / 0.06;
	}

	public static double kilometersperhourtometerspersecond(double number) {
		return number / 3.6;
	}
	
	public static double kilometersperhourtoknots(double number){
		return number / 1.852;
	}

	// Kilometers per minute
	public static double kilometersperminutetomilesperhour(double number) {
		return number * 37.2822715;
	}

	public static double kilometersperminutetomilesperminute(double number) {
		return number * 0.62137119;
	}

	public static double kilometersperminutetomilespersecond(double number) {
		return number * 0.01035618654;
	}

	public static double kilometersperminutetofeetperminute(double number) {
		return number * 3280.839894;
	}

	public static double kilometersperminutetofeetpersecond(double number) {
		return number * 54.68064;
	}

	public static double kilometersperminutetokilometersperhour(double number) {
		return number * 60;
	}

	public static double kilometersperminutetokilometerspersecond(double number) {
		return number / 60;
	}

	public static double kilometersperminutetometersperminute(double number) {
		return number * 1000;
	}

	public static double kilometersperminutetometerspersecond(double number) {
		return number / 0.06;
	}
	
	public static double kilometersperminutetoknots(double number){
		kmph = SpeedConversions.kilometersperminutetokilometersperhour(number);
		return SpeedConversions.kilometersperhourtoknots(kmph);
	}

	// Kilometers per second
	public static double kilometerspersecondtomilesperhour(double number) {
		return number * 2236.93629;
	}

	public static double kilometerspersecondtomilesperminute(double number) {
		return number * 37.2822714;
	}

	public static double kilometerspersecondtomilespersecond(double number) {
		return number * 0.6213711924;
	}

	public static double kilometerspersecondtofeetperminute(double number) {
		return number * 196850.39364;
	}

	public static double kilometerspersecondtofeetpersecond(double number) {
		return number * 3280.8384;
	}

	public static double kilometerspersecondtokilometersperhour(double number) {
		return number * 3600;
	}

	public static double kilometerspersecondtokilometersperminute(double number) {
		return number * 60;
	}

	public static double kilometerspersecondtometersperminute(double number) {
		return number * 60000;
	}

	public static double kilometerspersecondtometerspersecond(double number) {
		return number * 1000;
	}
	
	public static double kilometerspersecondtoknots(double number){
		kmph = SpeedConversions.kilometerspersecondtokilometersperhour(number);
		return SpeedConversions.kilometersperhourtoknots(kmph);
	}

	// Meters per minute
	public static double metersperminutetomilesperhour(double number) {
		return number * 0.0372822715;
	}

	public static double metersperminutetomilesperminute(double number) {
		return number * 0.000621371192;
	}

	public static double metersperminutetomilespersecond(double number) {
		return number * 0.0000103561865;
	}

	public static double metersperminutetofeetperminute(double number) {
		return number * 3.2808399;
	}

	public static double metersperminutetofeetpersecond(double number) {
		return number * 0.0546806649;
	}

	public static double metersperminutetokilometersperhour(double number) {
		return number * 0.06;
	}

	public static double metersperminutetokilometersperminute(double number) {
		return number * 0.001;
	}

	public static double metersperminutetokilometerspersecond(double number) {
		return number / 60000;
	}

	public static double metersperminutetometerspersecond(double number) {
		return number / 60;
	}
	
	public static double metersperminutetoknots(double number){
		kmph = SpeedConversions.metersperminutetokilometersperhour(number);
		return SpeedConversions.kilometersperhourtoknots(kmph);
	}

	// Meters per second
	public static double meterspersecondtomilesperhour(double number) {
		return number * 2.23693629;
	}

	public static double meterspersecondtomilesperminute(double number) {
		return number * 0.03728227152;
	}

	public static double meterspersecondtomilespersecond(double number) {
		return number * 0.00062137119;
	}

	public static double meterspersecondtofeetperminute(double number) {
		return number * 196.850394;
	}

	public static double meterspersecondtofeetpersecond(double number) {
		return number * 3.280839894;
	}

	public static double meterspersecondtokilometersperhour(double number) {
		return number * 3.6;
	}

	public static double meterspersecondtokilometersperminute(double number) {
		return number * 0.06;
	}

	public static double meterspersecondtokilometerspersecond(double number) {
		return number * 0.001;
	}

	public static double meterspersecondtometersperminute(double number) {
		return number * 60;
	}
	
	public static double meterspersecondtoknots(double number){
		kmph = SpeedConversions.kilometerspersecondtokilometersperhour(number);
		return SpeedConversions.kilometersperhourtoknots(kmph);
	}
	
	//Knots
	public static double knotstomilesperhour(double number){
		kmph = SpeedConversions.knotstokilometersperhour(number);
		return SpeedConversions.kilometersperhourtomilesperhour(kmph);
	}
	
	public static double knotstomilesperminute(double number){
		kmph = SpeedConversions.knotstokilometersperhour(number);
		return SpeedConversions.kilometersperhourtomilesperminute(kmph);
	}
	
	public static double knotstomilespersecond(double number){
		kmph = SpeedConversions.knotstokilometersperhour(number);
		return SpeedConversions.kilometersperhourtomilespersecond(kmph);
	}
	
	public static double knotstofeetperminute(double number){
		kmph = SpeedConversions.knotstokilometersperhour(number);
		return SpeedConversions.kilometersperhourtofeetperminute(kmph);
	}
	
	public static double knotstofeetpersecond(double number){
		kmph = SpeedConversions.knotstokilometersperhour(number);
		return SpeedConversions.kilometersperhourtofeetpersecond(kmph);
	}
	
	public static double knotstokilometersperhour(double number){
		return number * 1.852;
	}
	
	public static double knotstokilometersperminute(double number){
		kmph = SpeedConversions.knotstokilometersperhour(number);
		return SpeedConversions.kilometersperhourtokilometersperminute(kmph);
	}
	
	public static double knotstokilometerspersecond(double number){
		kmph = SpeedConversions.knotstokilometersperhour(number);
		return SpeedConversions.kilometersperhourtokilometerspersecond(kmph);
	}
	
	public static double knotstometersperminute(double number){
		kmph = SpeedConversions.knotstokilometersperhour(number);
		return SpeedConversions.kilometersperhourtometersperminute(kmph);
	}
	
	public static double knotstometerspersecond(double number){
		kmph = SpeedConversions.knotstokilometersperhour(number);
		return SpeedConversions.kilometersperhourtometerspersecond(kmph);
	}

}
