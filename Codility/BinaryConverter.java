public class BinaryConverter {
	
	public static Integer binaryConverter(int decimalNumber) {
		if(decimalNumber == 0) {
			return decimalNumber;
		}
		
		StringBuilder binaryNumber = new StringBuilder();
		Integer quotient = decimalNumber;
		
		while(quotient > 0) {
			int remainder = quotient % 2;
			binaryNumber.append(remainder);
			quotient /= 2;
		}
		binaryNumber = binaryNumber.reverse();
		
		return Integer.valueOf(binaryNumber.toString());
	}
	
	public static int longestGap(int N) {
		
		//int binaryNumber = binaryConverter(number);
		//String binaryString = Integer.toString(number);
		String binaryString = Integer.toString(N,2);

		
		boolean started = false;
		
		int counter = 0;
		int max = 0;
		
		for(int i = 0; i < binaryString.length(); i++) {
			String sub = binaryString.substring(i, i+1);
			if(sub.equals("1")) {
				if(started) {
					if(counter > max) {
						max = counter;
					}
				}
				counter = 0;
				started = true;
			}
			if(sub.equals("0")) {
				counter++;
			}
		}
			
		return max;
	}

	public static void main(String[] args) {
		
		
		int longest = longestGap(10);
		
		//System.out.println(nine);
		System.out.println(binaryConverter(1041));
	}
	
	
}

