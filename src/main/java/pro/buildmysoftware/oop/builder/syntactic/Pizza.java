package pro.buildmysoftware.oop.builder.syntactic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Pizza {
	// required
	private String pie;
	// optional
	private String cheese;
	// optional
	private String sauce;
	// optional toppings
	private Collection<String> toppings;

	private Pizza(String pie, String cheese, String sauce,
		      Collection<String> toppings) {
		if (pie == null) {
			throw new RuntimeException("Pizza must have a pie");
		}
		this.pie = pie;
		this.cheese = cheese;
		this.sauce = sauce;
		this.toppings = toppings;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Pizza pizza = (Pizza) o;
		return Objects.equals(pie, pizza.pie) && Objects
			.equals(cheese, pizza.cheese) && Objects
			.equals(sauce, pizza.sauce) && Objects
			.equals(toppings, pizza.toppings);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pie, cheese, sauce, toppings);
	}

	@Override
	public String toString() {
		return "Pizza{" + "pie='" + pie + '\'' + ", cheese='" + cheese + '\'' + ", sauce='" + sauce + '\'' + ", toppings=" + toppings + '}';
	}

	public static class PizzaBuilder {
		private String pie;
		private String cheese;
		private String sauce;
		private Collection<String> toppings;

		private PizzaBuilder() {
			toppings = new ArrayList<>();
		}

		public static PizzaBuilder withPie(String pie) {
			return new PizzaBuilder().withPieInternal(pie);
		}

		public PizzaBuilder withCheese(String cheese) {
			this.cheese = cheese;
			return this;
		}

		public PizzaBuilder withSauce(String sauce) {
			this.sauce = sauce;
			return this;
		}

		public PizzaBuilder addTopping(String topping) {
			toppings.add(topping);
			return this;
		}

		public Pizza createPizza() {
			return new Pizza(pie, cheese, sauce, toppings);
		}

		private PizzaBuilder withPieInternal(String pie) {
			this.pie = pie;
			return this;
		}
	}
}
