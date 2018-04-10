
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 30;
		long longTotal = 50000 + 10 * (byteValue + shortValue + intValue);
		short shortTotal = (short)(5000 + 10 * (byteValue + shortValue + intValue));
		
		System.out.println(longTotal);
		System.out.println(shortTotal);
		
	}

}
