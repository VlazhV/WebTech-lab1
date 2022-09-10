package task16.Comparators;

import task12_task14_task15.Book;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        return a.getTitle().compareTo(b.getTitle());
    }
}
