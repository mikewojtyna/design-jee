package pro.buildmysoftware.oop.order.informationexpert.bad;

import java.util.Optional;

interface OrderRepository {
	Optional<Order> findOrder(String orderId);
}
