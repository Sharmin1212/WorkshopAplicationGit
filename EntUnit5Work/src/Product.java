
public class Product {
	private int codProd;
	private String prodDescription;
	private double prodPrice;
	private int prodStock;

	public Product() {
	}

	public int getCodProd() {
		return codProd;
	}

	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}

	public String getProdDescription() {
		return prodDescription;
	}

	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	public int getProdStock() {
		return prodStock;
	}

	public void setProdStock(int prodStock) {
		this.prodStock = prodStock;
	}
}