
package MathGame;

import java.util.Random;
import java.math.RoundingMode;
import java.text.DecimalFormat;

//Question Class
public class Question {

	Random random = new Random();
	
	//to generate random question	
	public String GenerateQuestion() {

		// generating random numbers between 0-25
		int num1 = random.nextInt(25);
		int num2 = random.nextInt(25);

		// selecting random operator from (+ - * /)
		String operators = "+-*/";
		char operator = operators.charAt(random.nextInt(operators.length()));

		String question = String.format("What is %d %s %d ?", num1, operator, num2);

		return question;
	}

	//	method for evaluating the answer	
	public double evaluateAnswer(String question) {
		String[] questionArray = question.split(" ");
		final DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.UP);
		int random1 = Integer.parseInt(questionArray[2]);
		int random2 = Integer.parseInt(questionArray[4]);
		String operator = questionArray[3];

		double result = 0;
		switch (operator) {
		case "+":
			result = random1 + random2;
			break;
		case "-":
			result = random1 - random2;
			break;
		case "*":
			result = random1 * random2;
			break;
		case "/":
			result = (double) random1 / random2;
			break;
		}

		;
		String tempRes = df.format(result);
		return Double.parseDouble(tempRes);
	}
}
