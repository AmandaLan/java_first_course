
public class Product {
	

//	public String toString() {
//		return "Product name=" + name + ", quantity=" + quantity + ", price=" + price + ", total=" + this.getTotal() ;
//	}

	private String name;
	private int quantity;
	private int price;
	private int total;
	
	public Product(String Name, int Quantity, int Price) {
		this.name = Name;
		this.quantity = Quantity;
		this.price = Price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return price * quantity;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
