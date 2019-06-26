import java.util.*;
class Book
{
    int isbn;
    String title;
   int price;
    Book(int isbn,String title,int price)
    {
       this.isbn=isbn;
       this.title=title;
       this.price=price;
    }
   
}
class Magazine extends Book
{
    String type;
    Magazine(int isbn,String title,int price,String type)
    {
        super(isbn,title,price);   
        this.type=type;
    }
    void display()
    {
        System.out.println("Isbn number of magazine is: "+isbn);
        System.out.println("title of magazine is: "+title);
        System.out.println("Price of magazine is: "+price);
        System.out.println("Type of magzine is: "+type+"\n");
    }
   
}
class Novel extends Book
{
    String author;
    Novel(int isbn,String title,int price,String author)
    {
        super(isbn,title,price);
        this.author=author;
    }
     
     void display()
    {
        
        System.out.println("Isbn number of novel is: "+isbn);
        System.out.println("title of novel is: "+title);
        System.out.println("Price of novel is: "+price);
        System.out.println("The author of novel is: "+author);
    }
}

public class BookDemo2
{
    public static void main(String args[])
    {
        Book b=new Book(12,"Java",750);
        Magazine m=new Magazine(190,"Edition1.1",75,"Sports");
        Novel n=new Novel(172,"C++",800,"Kathy");
        m.display();
        n.display();
      
    }
}