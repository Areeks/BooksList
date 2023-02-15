import java.util.LinkedList;
import java.util.List;

class Book
{
    String name;
    int date;

    public Book(String _name, int _date)
    {
        name = _name;
        date = _date;
    }

    public int getDate()
    {
        return date;
    }

    public String getName()
    {
        return name;
    }
}

class Books
{
    List<Book> allBook;

    public Books()
    {
        allBook = new LinkedList();
    }

    public void addBook(Book x)
    {
        allBook.add(x);
    }

    public void GetDateBooks(int date)
    {
        for(Book book : allBook)
        {
            if(book.getDate()>date)
                System.out.println("Book: " + book.getName() + " Date: " + book.getDate());
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Books books = new Books();
        books.addBook(new Book("Asta Lavista", 1999));
        books.addBook(new Book("Tony Mony", 2005));
        books.addBook(new Book("Bill Citi", 1865));
        books.addBook(new Book("Mana Pana", 2010));
        books.addBook(new Book("Trini Dini", 2003));
        books.addBook(new Book("Moni Poni", 1999));

        books.GetDateBooks(2000);


    }
}