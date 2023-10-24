package sem_4.task;

import java.util.List;

public interface BookRepos {
    Book findById(String id);
    List<Book> findAll();
}