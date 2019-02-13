package pro.buildmysoftware.oop.order.good;

class OrderService {

	private final OrderRepository repository;
	private final PaymentGateway paymentGateway;
	private DiscountManager discountManager;

	public OrderService(OrderRepository repository,
			    PaymentGateway paymentGateway,
			    DiscountManager discountManager) {
		if (repository == null || paymentGateway == null || discountManager == null) {
			throw new NullPointerException();
		}
		this.repository = repository;
		this.paymentGateway = paymentGateway;
		this.discountManager = discountManager;
	}

	void payForOrder(String orderId) {
		repository.findOrder(orderId).ifPresent(order -> {
			int totalCost = order.totalCost(discountManager
				.currentDiscountPolicy());
			paymentGateway.pay(totalCost);
		});
	}
}
