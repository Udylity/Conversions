package conversions;

/**
 * Class that helps you convert Weights
 * @author Dylan Richards
 * @version 1.0
 */
public class WeightConversions {

	//Ounces
	public static double ouncestopounds(double number) {
		return number * 0.0625;
	}

	public static double ouncestoshorttons(double number) {
		return number * 312500;
	}
	
	public static double ouncestolongtons(double number) {
		return number * 279020;
	}

	public static double ouncestomilligrams(double number) {
		return number * 28349.5;
	}

	public static double ouncestograms(double number) {
		return number * 28.3495;
	}

	public static double ouncestokilograms(double number) {
		return number * 0.0283495;
	}

	//Pounds
	public static double poundstoounces(double number) {
		return number * 16;
	}

	public static double poundstoshorttons(double number) {
		return number * 0.0005;
	}

	public static double poundstolongtons(double number) {
		return number * 0.000446429;
	}

	public static double poundstomilligrams(double number) {
		return number * 453592;
	}

	public static double poundstograms(double number) {
		return number * 453.592;
	}

	public static double poundstokilograms(double number) {
		return number * 0.453592;
	}
	
	//Short Tons

	public static double shorttonstoounces(double number) {
		return number * 32000;
	}

	public static double shorttonstopounds(double number) {
		return number * 2000;
	}

	public static double shorttonstolongtons(double number) {
		return number * 0.892857;
	}
	

	public static double shorttonstomilligrams(double number) {
		return number * 907185000;
	}

	public static double shorttonstograms(double number) {
		return number * 907185;		
	}
	

	public static double shorttonstokilograms(double number) {
		return number * 907.185;
	}
	
	//Long Tons

	public static double longtonstoounces(double number) {
		return number * 35840;
	}

	public static double longtonstopounds(double number) {
		return number * 2240;
	}

	public static double longtonstoshorttons(double number) {
		return number * 1.12;
	}

	public static double longtonstomilligrams(double number) {
		return number * 1016000000;
	}

	public static double longtonstograms(double number) {
		return number * 1016000;
	}

	public static double longtonstokilograms(double number) {
		return number * 1016.05;
	}
	
	//Milligrams

	public static double milligramstoounces(double number) {
		return number * 0.000035274;
	}

	public static double milligramstopounds(double number) {
		return number * 0.0000022046;
	}

	public static double milligramstoshorttons(double number) {
		return number * 0.0000000011023;
	}

	public static double milligramstolongtons(double number) {
		return number * 0.00000000098421;
	}

	public static double milligramstograms(double number) {
		return number * 0.001;
	}

	public static double milligramstokilograms(double number) {
		return number * 0.000001;
	}
	
	//Grams

	public static double gramstoounces(double number) {
		return number * 0.035274;
	}

	public static double gramstopounds(double number) {
		return number * 0.00220462;
	}

	public static double gramstoshorttons(double number) {
		return number * 0.0000011023;
	}

	public static double gramstolongtons(double number) {
		return number * 0.00000098421;
	}

	public static double gramstomilligrams(double number) {
		return number * 1000;
	}

	public static double gramstokilograms(double number) {
		return number * 0.001;
	}
	
	//Kilograms

	public static double kilogramstoounces(double number) {
		return number * 35.274;
	}

	public static double kilogramstopounds(double number) {
		return number * 2.20462;
	}

	public static double kilogramstoshorttons(double number) {
		return number * 0.00110231;
	}

	public static double kilogramstolongtons(double number) {
		return number * 0.000984207;
	}

	public static double kilogramstomilligrams(double number) {
		return number * 1000000;
	}

	public static double kilogramstograms(double number) {
		return number * 1000;
	}

	
}
