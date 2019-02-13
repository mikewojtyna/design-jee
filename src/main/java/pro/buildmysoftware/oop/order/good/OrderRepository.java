package pro.buildmysoftware.oop.order.good;

import java.util.Optional;

interface OrderRepository {
	Optional<Order> findOrder(String orderId);
}
