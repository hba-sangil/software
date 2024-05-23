
public class Book {
	private String id;
    private String title;
    private String author;
    private int publicationYear;

    public Book(String id, String title, String author, int publicationYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    
    public String getId() {
        return id;
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book{id='" + id + "', 제목='" + title + "', 저자='" + author + "', 출판년도=" + publicationYear + "}";
    }
}
