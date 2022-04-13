package MathGame;

import java.util.Random;
import java.util.Scanner;

//class for MathGame
public class MathGame {

	public static int highScore = 0;

	//	lets begain MathGame
	public void startGame(int numOfQuestions) {

		System.out.println("***************** Hi Gamer lets play Game ***********************");
		System.out.println("First-Attempt  correct Answer : 20 Points");
		System.out.println("Second-Attempt correct Answer : 10 Points");
		System.out.println("last-Attempt incorrect Answer : 0 Points");
		System.out.println("Please note : In case of division, please round off to 2 digits (example: 2.76 )    ");

		Scanner scanner = new Scanner(System.in);

		// will terminate the loop when Gamer will choose NO
		while (true) {
			int score = 0;

			Question q = new Question();
			for (int i = 0; i < numOfQuestions; ++i) {

				String question = q.GenerateQuestion();
				double result = q.evaluateAnswer(question);
				

				System.out.println(question);

				double inputAns = scanner.nextDouble();

				if (inputAns == result) {
					System.out.println(GenerateMessage("Right"));
					score += 20;
				} else {
					System.out.println("Ooo No, Wrong Answer. lets do it once again");
					System.out.println(question);
					inputAns = scanner.nextDouble();

					if (inputAns == result) {
						System.out.println(GenerateMessage("Right"));
						score += 10;
					} else {
						System.out.println(GenerateMessage("Sorry, you have one more chance"));
					}
				}
			}

			// updating HighScore
			if (score > highScore) {
				highScore = score;
			}
			
			System.out.println("Your Result is " + score);
			System.out.println("High Score is " + highScore);
			

			System.out.println("Do you wish to play again ?(yes/no)");

			if (scanner.next().equals("no"))
				break;
		}
		System.out.println("Thank you for playing ");
		scanner.close();

	}

	//	for generating random messages
	private String GenerateMessage(String AnswerType) {
		String MessageOutput = "";

		String[] wrongs = { "Ooo No, Wrong Answer :( ", "Wrong Answer", "Sorry! its not match" };
		String[] rights = { "Hurray! you are right", "you are a mathematician", "Correct Answer" };

		Random random = new Random();

		int randomInt = random.nextInt(3);
		if (AnswerType == "Right") {
			MessageOutput = rights[randomInt];
		} else {
			MessageOutput = wrongs[randomInt];
		}
		return MessageOutput;
	}
}
