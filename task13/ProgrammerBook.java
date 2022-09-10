package task13;

import task12_task14_task15.Book;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String isbn, String language, int level){
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.language + " " + this.level;
    }

    @Override
    public boolean equals(Object o){
        ProgrammerBook pBook = (ProgrammerBook) o;
        return super.equals(o) && this.language.equals(pBook.language) && this.level == pBook.level;
    }

    @Override
    public int hashCode(){
        int hashCode = 0;
        byte[] language = this.language.getBytes();
        for (byte character :language)
            hashCode += (int) character * (int)character;
        hashCode += level * level;

        return super.hashCode() + hashCode;
    }


}
