package pro.buildmysoftware.oop.order.good;

import java.time.LocalDate;
import java.time.Month;

public class DiscountManager {
	DiscountPolicy currentDiscountPolicy() {
		if (LocalDate.now().getMonth() == Month.DECEMBER) {
			return () -> 0.8;
		}
		// TODO: a lot of other rules to apply the discount - can use
		//  e.g. configuration files

		// finally return the default discount
		return () -> 1;
	}
}
