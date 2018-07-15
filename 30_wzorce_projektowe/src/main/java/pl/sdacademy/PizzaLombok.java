package pl.sdacademy;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString

public class PizzaLombok {
	String dough = "";
	private String sauce = "";
	private String topping = "";
}
