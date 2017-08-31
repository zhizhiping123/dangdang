package entity.vo;

import entity.DDBook;
import entity.DDProduct;

public class BookDetailVo {
	private DDBook ddBook;
	private DDProduct ddProduct;
	private Double savePrice;
	public DDBook getDdBook() {
		return ddBook;
	}
	public void setDdBook(DDBook ddBook) {
		this.ddBook = ddBook;
	}
	public DDProduct getDdProduct() {
		return ddProduct;
	}
	public void setDdProduct(DDProduct ddProduct) {
		this.ddProduct = ddProduct;
	}
	public Double getSavePrice() {
		return this.savePrice;
	}
	public void setSavePrice(Double savePrice) {
		this.savePrice= savePrice;
	}
	

}
