package pro.buildmysoftware.oop.order.informationexpert.good;

import java.util.Optional;

interface OrderRepository {
	Optional<Order> findOrder(String orderId);
}
