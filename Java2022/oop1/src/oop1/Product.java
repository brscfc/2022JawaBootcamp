package oop1;

									//Classlar PascalCase şeklinde isimlendirilir.
public class Product {
	private String name;
									// fieldlar camelCase şeklinde yazılır. //
	private double unitPrice;
	private double discount;
	private String imageUrl; 		// birden fazla ise imageler arrayy şeklinde kullanabiliriz String[] imageUrls;
									// şeklinde
	private int unitsInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
