package HashMapFolder;

import java.util.Hashmap;

public class BookHM {
    public static void main(String[] args) {
        HashMap<String, Book> books = new HashMap<String, Book>();

        Book javaBook       = new Book( title: "Java for Beginner", author: "John Doe");
        Book SeleniumBook   = new Book( title: "Selenium for Pro QA Engineer", author: "oim");
        Book CypressBook    = new Book( title: "Cypress the new Technology for QA Engineer", author: "oim");

        books.put("java", javaBook);
        books.put("selenium", seleniumBook);
        books.put("Cypress", cypressBook);

        for (Map.Entry b : books.entrySet()) {
            Book book   = (Book) b.getValue();
            System.out.println(b.getKey() + ": " + book.getTitle() + ", Author by " + book.getAuthor());
        }
    }
}