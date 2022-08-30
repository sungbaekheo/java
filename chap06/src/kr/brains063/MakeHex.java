package kr.brains063;

public class MakeHex {
	
	String makeHexNum(int decimal) {
		
		String hexNum = null;
		String digit;
		boolean a = true;
		while(a) {
			digit = String.valueOf(decimal % 16);
			
			switch(digit) {
			case "10": digit = "a"; break;
			case "11": digit = "b"; break;
			case "12": digit = "c"; break;
			case "13": digit = "d"; break;
			case "14": digit = "e"; break;
			case "15": digit = "f";
			}
			
			if(hexNum == null) {
				hexNum = digit;
			}
			else {
				hexNum = digit + hexNum;
			}
			if(decimal / 16 == 0) {
				a = false;
			}
			decimal = decimal / 16;
		}
		return hexNum;
	}

}
