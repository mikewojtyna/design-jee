package pro.buildmysoftware.oop.builder.syntactic;

import static pro.buildmysoftware.oop.builder.syntactic.Pizza.PizzaBuilder.withPie;

public class Example {
	public static void main(String[] args) {
		// @formatter:off
		Pizza pizza = withPie("thin")
			.withCheese("mozarella")
			.addTopping("mushroom")
			.addTopping("vegetables")
			.createPizza();
		// @formatter:on

		System.out.println(pizza);
	}
}
