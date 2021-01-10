package ctrl;

import java.io.File;
import java.util.HashMap;
import model.Book;
import model.DataSaving;

/**
 *
 * @author jingtian
 */
public class Controller {

    private final HashMap<String, Book> lsBook;
    private final String uri = "lsBooks.dat";

    public Controller() {
        File file = new File(uri);
        if (!file.exists()) {
            new DataSaving().write(new HashMap<String, Book>(), uri);
        }
        this.lsBook = (HashMap) new DataSaving().read(uri);
    }

    public void addBook(Book book) {
        lsBook.put(book.getId().toString(), book);
    }

}
