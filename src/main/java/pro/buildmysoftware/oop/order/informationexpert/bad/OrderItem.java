package pro.buildmysoftware.oop.order.informationexpert.bad;

class OrderItem {
	private String product;
	private int productPrice;
	private int count;
	private boolean shouldBePaid;

	public boolean isShouldBePaid() {
		return shouldBePaid;
	}

	public String getProduct() {
		return product;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public int getCount() {
		return count;
	}
}
