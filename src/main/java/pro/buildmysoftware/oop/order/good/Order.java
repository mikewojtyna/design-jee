package pro.buildmysoftware.oop.order.good;

import java.util.Collection;

class Order {
	private Collection<OrderItem> items;

	int totalCost(DiscountPolicy discountPolicy) {
		return (int) (items.stream().filter(OrderItem::shouldBePaid)
			.mapToInt(OrderItem::price).sum() * discountPolicy
			.discount());
	}

}
