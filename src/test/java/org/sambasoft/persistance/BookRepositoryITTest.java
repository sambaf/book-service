package org.sambasoft.persistance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

@DataJdbcTest(properties = {"spring.datasource.url=jdbc:tc:postgresql:14.4:///"})
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Disabled
class BookRepositoryITTest {

  @Autowired
  private BookRepository bookRepository;

  @Test
  void testCreateBook() {
    Book book = bookRepository.save(Book.of("test", "author", "title", 99.00));
    assertNotNull(book);
    assertNotNull(book.id());
    assertEquals(book.author(), "author");
    assertEquals(book.title(), "title");
    assertEquals(book.name(), "test");
    assertEquals(book.price(), 99.00);
  }


}