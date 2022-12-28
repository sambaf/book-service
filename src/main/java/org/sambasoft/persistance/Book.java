package org.sambasoft.persistance;

import org.springframework.data.annotation.Id;

public record Book(@Id Long id, String name, String author, String title, Double price) {

  public static Book of(String name, String author, String title, Double price) {
    return new Book(null, name, author, title, price);
  }

}
