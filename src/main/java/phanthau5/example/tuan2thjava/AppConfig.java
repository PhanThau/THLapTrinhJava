package phanthau5.example.tuan2thjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import phanthau5.example.tuan2thjava.entity.Book;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setId(1L);
        book1.setTitle("Lap trinh web spring mvc");
        book1.setAuthor("Anh Nguyen");
        book1.setPrice(10.99);
        book1.setCategory("cong nghe thong tin");
        books.add(book1);

        Book book2 = new Book();
        book2.setId(3L);
        book2.setTitle("Lap trinh web");
        book2.setAuthor("Anh Nguyen");
        book2.setPrice(20.20);
        book2.setCategory("cong nghe thong tin");
        books.add(book2);

        Book book3 = new Book();
        book3.setId(3L);
        book3.setTitle("Lap trinh ung dung Java");
        book3.setAuthor("Xuan Nhan");
        book3.setPrice(10.99);
        book3.setCategory("cong nghe thong tin");
        books.add(book3);

        Book book4 = new Book();
        book4.setId(4L);
        book4.setTitle("Lap trinh Java");
        book4.setAuthor("Anh Nguyen");
        book4.setPrice(129.99);
        book4.setCategory("cong nghe thong tin");
        books.add(book4);

        return books;

    }
}