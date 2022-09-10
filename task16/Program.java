package task16;

import task12_task14_task15.Book;
import task16.Comparators.*;


import java.util.ArrayList;
import java.util.Comparator;

import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Ono", "S. King", 34));
        books.add(new Book("Ono", "J. London", 59));
        books.add(new Book("Evgeniy Onegin", "A. Pushkin", 101));
        books.add(new Book("Evgeniy Onegin", "A. Pushkin", 100));
        books.add(new Book("Ona", "A. Pushkin", 100));

        Comparator<Book> titleComparator = new TitleComparator();//!
        Comparator<Book> authorComparator = new AuthorComparator();
        Comparator<Book> priceComparator = new PriceComparator();

        Comparator<Book> titleAuthorComparator = titleComparator.thenComparing(authorComparator);
        Comparator<Book> authorTitleComparator = authorComparator.thenComparing(titleComparator);
        Comparator<Book> authorTitlePriceComparator = authorTitleComparator.thenComparing(priceComparator);



        sortAndPrint(books, titleComparator);
        sortAndPrint(books, titleAuthorComparator);
        sortAndPrint(books, authorTitleComparator);
        sortAndPrint(books, authorTitlePriceComparator);


        Book book1 = books.get(0);
        book1.setIsbn("ISBN 978-5-699-12014-7");
        Book book2 = (Book)book1.clone();

        System.out.println(book1.compareTo(book2));

    }

    public static void sortAndPrint(ArrayList<Book> books, Comparator<Book> comp){
        books.sort(comp);
        for(Book book : books)
            System.out.println(book.toString() + " ");
        System.out.println("\n");
    }

}
