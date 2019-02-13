package pro.buildmysoftware.oop.order.good;

class OrderItem {
	private String product;
	private int productPrice;
	private int count;

	boolean shouldBePaid() {
		return true;
	}

	int price() {
		return productPrice * count;
	}
}
