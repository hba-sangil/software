import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookManager {
    private List<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public boolean addBook(Book book) {
        for (Book b : books) {
            if (b.getId().equals(book.getId())) {
                System.out.println("해당 ID(" + book.getId() + ")는 이미 존재합니다.");
                return false;
            }
        }
        books.add(book);
        Collections.sort(books);
        System.out.println(book + "도서가 추가되었습니다.");
        return true;
    }
    
    public Book searchBook(String id) {
        for (Book b : books) {
            if (b.getId().equals(id)) {
                System.out.println("검색 결과: " + b);
                return search_bs(id);
            }
        }
        System.out.println("검색된 도서가 없습니다.");
        return null;
    }

    //public Book searchBook(String id) {
        //for (Book b : books) {
            //if (b.getId().equals(id)) {
                //System.out.println("검색 결과: " + b);
                //return b;
            //}
        //}
        //System.out.println("검색된 도서가 없습니다.");
        //return null;
    //}

    public boolean removeBook(String id) {
        for (Book b : books) {
            if (b.getId().equals(id)) {
                books.remove(b);
                System.out.println(b + "도서를 삭제하였습니다.");
                return true;
            }
        }
        System.out.println("해당 ID(" + id + ")의 도서를 찾을 수 없습니다.");
        return false;
    }
    
    public Book search_bs(String id) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            Book midBook = books.get(mid);
            int cmp = midBook.getId().compareTo(id);

            if (cmp < 0) {
                left = mid + 1;
            } else if (cmp > 0) {
                right = mid - 1;
            } else {
                return midBook;
            }
        }

        return null; // Book not found
    }
}
