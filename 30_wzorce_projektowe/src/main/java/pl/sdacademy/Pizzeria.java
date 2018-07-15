package pl.sdacademy;

public class Pizzeria {
	public static void main(String[] args) {
		PizzaLombok pizza = PizzaLombok.builder()
			.dough("cross")
			.sauce("spicy")
			.topping("chicken")
			.build();
		System.out.println(pizza);
	}
}
