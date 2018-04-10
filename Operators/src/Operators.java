
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myResult = 1 + 2;
		System.out.println("1 + 2 = " + myResult);

		int previousResult = myResult;
		myResult = myResult - 1;
		
		System.out.println(previousResult + " - 1 = " + myResult);
		
		previousResult = myResult;
		
		myResult = myResult * 10;
		System.out.println(previousResult + " * 10 = " + myResult);
		
		previousResult = myResult;
		
		myResult = myResult / 5;
		System.out.println(previousResult + " / 5 = " + myResult);
		
		myResult++;
		System.out.println("result = " + myResult);
		
		myResult--;
		System.out.println("Result = " +myResult);
		
		myResult +=2;
		System.out.println("Result = " +myResult);
		
		myResult -=4;
		System.out.println("Result = " +myResult);
		
		myResult *=10;
		System.out.println("Result = " +myResult);
		
		myResult /=2;
		System.out.println("Result = " +myResult);
		
		boolean isAlien = false;
		if (isAlien==false)
		System.out.println("You are an alien!");
		
		int topScore = 80;
		if (topScore<100)
			System.out.println("You have the highest score!");
	
		int secondTopScore = 95;
		if (topScore>secondTopScore && topScore<100)
		System.out.println("Yay! Everyone's a topper!");
		
		
		if((topScore>90) || (secondTopScore<90))
		System.out.println("One of these tests is true.");
	}

}
