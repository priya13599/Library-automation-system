package Bean;

import java.util.Date;

public class BookDetails {
	
	private String BookName;
	private String BookNo;
	private String AuthorName;
	private String PublisherName;
	private String Quantity;
	private String Edition;
	private String Price;
	public BookDetails(String bookName, String bookNo, String authorName, String publisherName, String quantity,
			String edition, String price) {
		this.BookName = bookName;
		this.BookNo = bookNo;
		this.AuthorName = authorName;
		this.PublisherName = publisherName;
		this.Quantity = quantity;
		this.Edition = edition;
		this.Price = price;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookNo() {
		return BookNo;
	}
	public void setBookNo(String bookNo) {
		BookNo = bookNo;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public String getPublisherName() {
		return PublisherName;
	}
	public void setPublisherName(String publisherName) {
		PublisherName = publisherName;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getEdition() {
		return Edition;
	}
	public void setEdition(String edition) {
		Edition = edition;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "BookDetails [BookName=" + BookName + ", BookNo=" + BookNo + ", AuthorName=" + AuthorName
				+ ", PublisherName=" + PublisherName + ", Quantity=" + Quantity + ", Edition=" + Edition + ", Price="
				+ Price + "]";
	}
	
	
	

}
