package sem_4.task;

import java.util.List;

public class BookServ {
    private BookRepos bookRepository;

    public BookServ(BookRepos bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book findBookById(String id) {
        return bookRepository.findById(id);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}