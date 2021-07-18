package bookinfraestructure;

import bookAplication.*;
import bookinfraestructure.repository.BooksRepositoryImpl;
import domain.services.BooksService;
import domain.services.BooksServiceFactory;

public class ApplicationMain {

    public static void main(String[] args) {
        BooksService booksService = BooksServiceFactory.getBooksService(new BooksRepositoryImpl());
        ConsoleApp consoleAplication = new ConsoleApp(System.console(), booksService);
        consoleAplication.waitForCommand();
    }
}
