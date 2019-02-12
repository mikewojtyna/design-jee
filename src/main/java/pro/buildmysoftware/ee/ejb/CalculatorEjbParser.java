package pro.buildmysoftware.ee.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class CalculatorEjbParser {
	@Inject
	private Calculator calculator;

	public int calculate(String args) {
		String[] argsArray = args.split(" ");
		return calculator.sum(Integer.parseInt(argsArray[0]), Integer
			.parseInt(argsArray[1]));
	}
}
