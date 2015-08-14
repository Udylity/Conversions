package conversions;

/**
 * Class that helps you convert Volume measurements
 * @author Dylan Richards
 * @version 1.0
 */
public class VolumeConversions {

	//From Gallons
	public static double gallontoquart(double number) {
		return number * 4;
	}

	public static double gallontopint(double number) {
		return number * 8;	
	}

	public static double gallontocup(double number) {
		return number * 16;	
	}	

	public static double gallontoounce(double number) {
		return number * 128;		
	}

	public static double gallontotablespoon(double number) {
		return number * 256;
	}
	
	public static double gallontoteaspoon(double number) {
		 return number * 768;		
	}

	public static double gallontoliter(double number) {
		return number * 3.785411784;	
	}

	public static double gallontodeciliter(double number) {
		return number * 37.85411784;		
	}
	
	public static double gallontocentiliters(double number) {
		return number * 378.5411784;
		
	}

	public static double gallontomilliliters(double number) {
		return number * 3785.411784;
	}
	
	//From quart
	public static double quarttogallon(double number) {
		return number * 0.25;
	}
	
	public static double quarttopint(double number) {
		return number * 2;
	}

	public static double quarttocup(double number) {
		return number * 4;
	}

	public static double quarttoounce(double number) {
		return number * 32;	
	}

	public static double quarttotablespoon(double number) {
		return number * 64;	
	}

	public static double quarttoteaspoon(double number) {
		return number * 192;	
	}

	public static double quarttoliter(double number) {
		return number * 0.946352946;	
	}

	public static double quarttodeciliter(double number) {
		return number * 9.46352946;		
	}

	public static double quarttocentiliters(double number) {
		return number * 94.6352946;		
	}
	
	public static double quarttomilliliters(double number) {
		return number * 946.352946;		
	}
	
	//From pint

	public static double pinttogallon(double number) {
		return number * 0.125;	
	}

	public static double pinttoquart(double number) {
		return number * 0.5;	
	}

	public static double pinttocup(double number) {
		return number * 2;	
	}

	public static double pinttoounce(double number) {
		return number * 16;
	}

	public static double pinttotablespoon(double number) {
		return number * 32;
	}

	public static double pinttoteaspoon(double number) {
		return number * 96;
	}

	public static double pinttoliter(double number) {
		return number * 0.473176473;
	}

	public static double pinttodeciliter(double number) {
		return number * 4.73176473;		
	}

	public static double pinttocentiliters(double number) {
		return number * 47.3176473;
	}

	public static double pinttomilliliters(double number) {
		return number * 473.176473;
	}

	//From cup
	public static double cuptogallon(double number) {
		return number / 16;
	}

	public static double cuptoquart(double number) {
		return number * 0.25;
	}

	public static double cuptopint(double number) {
		return number * 0.5;
	}

	public static double cuptoounce(double number) {
		return number * 8;
	}

	public static double cuptotablespoon(double number) {
		return number * 16;
	}

	public static double cuptoteaspoon(double number) {
		return number * 48;		
	}

	public static double cuptoliter(double number) {
		return number * 0.2365882365;
	}

	public static double cuptodeciliter(double number) {
		return number * 2.365882365;
	}

	public static double cuptocentiliters(double number) {
		return number * 23.65882365;
	}

	public static double cuptomilliliters(double number) {
		return number * 236.5882365;
	}
	
	//From ounces

	public static double ouncetogallon(double number) {
		return number / 128;
	}

	public static double ouncetoquart(double number) {
		return number / 32;
	}

	public static double ouncetopint(double number) {
		return number / 16;
	}

	public static double ouncetocup(double number) {
		return number / 8;	
	}

	public static double ouncetotablespoon(double number) {
		return number * 2;
	}

	public static double ouncetoteaspoon(double number) {
		return number * 6;
	}

	public static double ouncetoliter(double number) {
		return number / 33.814022701843;
	}

	public static double ouncetodeciliter(double number) {
		return number / 3.3814022701843;
	}

	public static double ouncetocentiliters(double number) {
		return number / 0.33814022701843;
	}

	public static double ouncetomilliliters(double number) {
		return number / 0.033814022701843;
	}
	
	//From Tablespoons

	public static double tablespoontogallon(double number) {
		return number / 256;
	}

	public static double tablespoontoquart(double number) {
		return number / 64;
	}

	public static double tablespoontopint(double number) {
		return number / 32;
	}

	public static double tablespoontocup(double number) {
		return number / 16;
	}

	public static double tablespoontoounce(double number) {
		return number * 0.5;
	}

	public static double tablespoontoteaspoon(double number) {
		return number * 3;
	}

	public static double tablespoontoliter(double number) {
		return number / 67.628045403686;
	}

	public static double tablespoontodeciliter(double number) {
		return number / 6.7628045403686;
	}

	public static double tablespoontocentiliters(double number) {
		return number / 0.67628045403686;
	}

	public static double tablespoontomilliliters(double number) {
		return number / 0.067628045403686;
	}

	//From Teaspoons
	public static double teaspoontogallon(double number) {
		return number / 768;
	}

	public static double teaspoontoquart(double number) {
		return number / 192;
	}

	public static double teaspoontopint(double number) {
		return number / 96;
	}

	public static double teaspoontocup(double number) {
		return number / 48;
	}

	public static double teaspoontoounce(double number) {
		 return number / 6;
	}

	public static double teaspoontotablespoon(double number) {
		 return number / 3;
	}

	public static double teaspoontoliter(double number) {
		 return number / 202.88413621105799168;
	}

	public static double teaspoontodeciliter(double number) {
		 return number / 20.288413621105799168;
	}

	public static double teaspoontocentiliters(double number) {
		 return number / 2.0288413621105799168;
	}

	public static double teaspoontomilliliters(double number) {
		 return number / 0.20288413621105799168;
	}

	// From Liters
	public static double literstogallon(double number) {
		 return number * 0.26417205235814842368;
	}

	public static double literstoquart(double number) {
		 return number * 1.0566882094325936128;
	}

	public static double literstopint(double number) {
		 return number * 2.1133764188651872256;
	}

	public static double literstocup(double number) {
		 return number * 4.2267528377303744512;
	}

	public static double literstoounce(double number) {
		 return number * 33.814022701842997248;
	}

	public static double literstotablespoon(double number) {
		 return number * 67.628045403685994496;
	}

	public static double literstoteaspoon(double number) {
		 return number * 202.88413621105799168;
	}

	public static double literstodeciliter(double number) {
		 return number * 10;
	}

	public static double literstocentiliters(double number) {
		 return number * 100;
	}

	public static double literstomilliliters(double number) {
		 return number * 1000;
	}
	
	// From Deciliters
	public static double deciliterstogallon(double number) {
		 return number * 0.026417205235814842368;
	}

	public static double deciliterstoquart(double number) {
		 return number * 0.10566882094325936128;
	}

	public static double deciliterstopint(double number) {
		 return number * 0.21133764188651872256;
	}

	public static double deciliterstocup(double number) {
		 return number * 0.42267528377303744512;
	}

	public static double deciliterstoounce(double number) {
		 return number * 3.3814022701842997248;
	}

	public static double deciliterstotablespoon(double number) {
		 return number * 6.7628045403685994496;
	}

	public static double deciliterstoteaspoon(double number) {
		 return number * 20.288413621105799168;
	}

	public static double deciliterstoliter(double number) {
		 return number * 0.1;
	}

	public static double deciliterstocentiliters(double number) {
		 return number * 10;
	}

	public static double deciliterstomilliliters(double number) {
		 return number * 100;
	}
	
	
	// From Centiliters
	public static double centiliterstogallon(double number) {
		 return number * 0.0026417205235814842368;
	}

	public static double centiliterstoquart(double number) {
		 return number * 0.010566882094325936128;
	}

	public static double centiliterstopint(double number) {
		 return number * 0.021133764188651872256;
	}

	public static double centiliterstocup(double number) {
		return number * 0.042267528377303744512;
	}

	public static double centiliterstoounce(double number) {
		return number * 0.33814022701842997248;
	}

	public static double centiliterstotablespoon(double number) {
		return number * 0.67628045403685994496;
	}

	public static double centiliterstoteaspoon(double number) {
		return number * 2.0288413621105799168;
	}

	public static double centiliterstoliter(double number) {
		return number * 0.01;
	}

	public static double centiliterstodeciliters(double number) {
		return number * 0.1;
	}

	public static double centiliterstomilliliters(double number) {
		return number * 10;
	}
	
	// From Milliliters
	public static double milliliterstogallon(double number) {
		return number * 0.00026417205235814842368;
	}

	public static double milliliterstoquart(double number) {
		return number * 0.0010566882094325936128;
	}

	public static double milliliterstopint(double number) {
		return number * 0.0021133764188651872256;
	}

	public static double milliliterstocup(double number) {
		return number * 0.0042267528377303744512;
	}

	public static double milliliterstoounce(double number) {
		return number * 0.033814022701842997248;
	}

	public static double milliliterstotablespoon(double number) {
		return number * 0.067628045403685994496;
	}

	public static double milliliterstoteaspoon(double number) {
		return number * 0.20288413621105799168;
	}

	public static double milliliterstoliter(double number) {
		return number * 0.001;
	}

	public static double milliliterstodeciliters(double number) {
		return number * 0.01;
	}

	public static double milliliterstocentiliters(double number) {
		return number * 0.1;
	}
	

}
