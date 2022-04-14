package deafult;

public class BookCopy {
	private int id;
	private boolean available;
	private Book book;

	public BookCopy(int id, Book book) {
		super();
		this.id = id;
		available = true;
		this.book = book;
	}

	public int getId() {
		return id;
	}

	public boolean isAvailable() {
		return available;
	}

	public Book getBook() {
		return book;
	}

}
