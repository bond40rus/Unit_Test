package sem_4.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import sem_4.task.BookRepos;
import sem_4.task.BookServ;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

    @Mock
    private BookRepos mockBockService;
    @InjectMocks
    private BookServ bookService;
    @Test
    public void findBookByIdShouldReturnBook() {
        when(mockBockService.findById("1")).thenReturn(new Book("1", "SomeTitle", "SomeAuthor"));
        String expectIdBook = "1";
        String actualIdBook = bookService.findBookById("1").getId();
        verify(mockBockService).findById("1");
        assertEquals(expectIdBook, actualIdBook, "Метод findBookById возвращает объект с не корректным ID");
    }
    @Test
    public void findAllBooksShouldReturnListBooks() {

        when(mockBockService.findAll())
                .thenReturn(new ArrayList<>(Arrays.asList(
                        new Book("1"),
                        new Book("2"),
                        new Book("3"),
                        new Book("4")
                )));
        int expectedSizeListBooks = 4;
        int actualSizeListBooks = bookService.findAllBooks().size();

        verify(mockBockService).findAll();
        assertEquals(expectedSizeListBooks,
                actualSizeListBooks,
                "Метод findAllBooks у не павильный размер листа");
    }
}