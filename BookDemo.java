import java.util.*;
class Book
{
    int isbn;
    String title;
    String author;
   int price;
    Book(int isbn,String title,String author,int price)
    {
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void displaydetails()
    {
        System.out.println("Book isbn: "+isbn);
       System.out.println("title: "+title);
       System.out.println("Author: "+author);
       System.out.println("Price: "+price);
    }
    public void discountedprice(int disc)
    {
        int m=(price*disc)/100;
        
        System.out.println("Amount to be paid after discount is:"+(price-m));
    }
}
public class BookDemo
{
    public static void main(String args[])
    {
        Book b=new Book(123413,"Java","Kathy",750);
        b.displaydetails();
        b.discountedprice(20);
    }
}