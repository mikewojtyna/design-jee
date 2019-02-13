package pro.buildmysoftware.oop.order.informationexpert.good;

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
