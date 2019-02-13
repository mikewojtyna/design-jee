package pro.buildmysoftware.oop.order.good;

class OrderService {

	private final OrderRepository repository;
	private final PaymentGateway paymentGateway;

	public OrderService(OrderRepository repository,
			    PaymentGateway paymentGateway) {
		if (repository == null || paymentGateway == null) {
			throw new NullPointerException();
		}
		this.repository = repository;
		this.paymentGateway = paymentGateway;
	}

	void payForOrder(String orderId) {
		repository.findOrder(orderId).ifPresent(order -> {
			int totalCost = order.totalCost();
			paymentGateway.pay(totalCost);
		});
	}
}
