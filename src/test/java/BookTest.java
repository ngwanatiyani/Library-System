import domain.Book;
import factory.BookFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

        @Test
        public void testBookIsCreated() {
            Book book = new Book.Builder("B001", "978-0357442234", "Contemporary Project Management")
                    .author("Timothy J. Kloppenborg")
                    .subject("Project Management")
                    .publisher("Cengage")
                    .publicationYear(2019)
                    .build();

            assertNotNull(book);
        }

        @Test
        public void testBookTitle() {
            Book book = new Book.Builder("B001", "978-0357442234", "Contemporary Project Management")
                    .build();

            assertEquals("Contemporary Project Management", book.getTitle());
        }

        @Test
        public void testBookAuthor() {
            Book book = new Book.Builder("B001", "978-0357442234", "Contemporary Project Management")
                    .author("Timothy J. Kloppenborg")
                    .build();

            assertEquals("Timothy J. Kloppenborg", book.getAuthor());
        }
    }
