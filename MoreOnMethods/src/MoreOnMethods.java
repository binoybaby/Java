
public class MoreOnMethods {

	public static void main(String[] args) {
		
		
		int highScore = calculateScore(true, 800, 5, 100);
		System.out.println("your final score was " + highScore);
		
		highScore =  calculateScore(true, 10000, 8, 200);
		System.out.println("your final score was " + highScore);
	}

	public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {
		
			if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
						return finalScore;
		}else {
			return -1;
		}
		
	}

}
