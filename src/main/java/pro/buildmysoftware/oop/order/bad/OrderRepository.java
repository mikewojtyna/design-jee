package pro.buildmysoftware.oop.order.bad;

import java.util.Optional;

interface OrderRepository {
	Optional<Order> findOrder(String orderId);
}
