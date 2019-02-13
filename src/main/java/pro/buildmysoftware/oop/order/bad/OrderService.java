package pro.buildmysoftware.oop.order.bad;

import java.util.Collection;

class OrderService {
	private OrderRepository repository;
	private PaymentGateway paymentGateway;

	OrderService(OrderRepository repository,
		     PaymentGateway paymentGateway) {
		this.repository = repository;
		this.paymentGateway = paymentGateway;
	}

	void payForOrder(String orderId) {
		repository.findOrder(orderId).ifPresent(order -> {
			Collection<OrderItem> orderItems = order.getItems();
			int totalCost = orderItems.stream()
				.filter(orderItem -> orderItem.isShouldBePaid())
				.mapToInt(item -> item.getProductPrice() * item
					.getCount()).sum();
			paymentGateway.pay(totalCost);
		});
	}
}
