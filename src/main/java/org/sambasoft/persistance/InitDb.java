package org.sambasoft.persistance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class InitDb {

  @Autowired
  private BookRepository bookRepository;

  @EventListener(ApplicationReadyEvent.class)
  public void createTestBooks() {
    bookRepository.deleteAll();
    bookRepository.saveAll(List.of(
        Book.of("test-1", "author-1", "title-1", 99.09),
        Book.of("test-2", "author-2", "title-2", 49.00),
        Book.of("test-3", "author-3", "title-3", 94.11)
    ));
    System.out.println("======================================================");
    System.out.println(bookRepository.findAll());
    System.out.println("======================================================");
  }

}
