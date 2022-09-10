package task12_task14_task15;

public class Book implements Comparable<Book>, Cloneable{
    private String title;
    private String author;
    private int price;
    private static int edition;

    private String isbn;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author, int price, String isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getAuthor(){ return author; }
    public String getTitle() { return title; }
    public int getPrice() { return  price; }

    public void setIsbn(String isbn) { this.isbn = isbn; }



    @Override
    public String toString(){
        return title + " " + author + " " + edition + " " + price;
    }


    @Override
    public boolean equals(Object o){
        Book book = (Book)o;
        return title.equals(book.title) && author.equals(book.author)
                && price == book.price;
    }

    @Override
    public int hashCode(){
        int hashCode = 0;
        byte[] title = this.title.getBytes();
        for (byte character :title)
            hashCode += (int) character * (int)character;

        hashCode += author.hashCode();
        hashCode += price * price * Book.edition;

        return hashCode;
    }

    public Object clone()  {
        return new Book(this.title, this.author, this.price, this.isbn);

    }

    @Override
    public int compareTo(Book book){
        return this.isbn.compareTo(book.isbn);
    }

}
