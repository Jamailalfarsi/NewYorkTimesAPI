
public class Results2 {
	
	private String published_date;
	private String previous_published_date;
	private String published_date_description;
	private Books[] books;
    
	private String display_name;
	public String getDisplay_name() {
		return display_name;
	}

	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	public String getPublished_date() {
		return published_date;
	}

	public void setPublished_date(String published_date) {
		this.published_date = published_date;
	}

	public String getPrevious_published_date() {
		return previous_published_date;
	}

	public void setPrevious_published_date(String previous_published_date) {
		this.previous_published_date = previous_published_date;
	}

	public String getPublished_date_description() {
		return published_date_description;
	}

	public void setPublished_date_description(String published_date_description) {
		this.published_date_description = published_date_description;
	}

	
	

	
	public Books[] getBooks() {
		return books;
	}

	public void setBooks(Books[] books) {
		this.books = books;
	}

}
