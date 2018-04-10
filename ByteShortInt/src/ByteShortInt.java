
public class ByteShortInt {

	public static void main(String[] args) {
		
		// int has width of 32
		int myMinValue = -2_147_483_648;
		int myMaxValue = 2_147_483_647;
		
		// byte has width of 8
		byte myByteValue = 127;
		
		// byte has width of 16
		short myShortValue = 32767;
		
		// long has width of 64
		long myLongValue = 9_223_372_036_854_775_807L;
		
		//System.out.println(myMinValue);
		
		
		
		double a=20;
		double b=80;
		double sum;
		double remainder;
		sum=a+b;
		System.out.println("Sum = "+sum);
		remainder = sum%40;
		if (remainder <=20)
			System.out.println("Total has crossed the limit");
		
	}

}
