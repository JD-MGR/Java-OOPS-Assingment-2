
/**
 
 */
import java.util.*;
public class Library
{
    private List<String> books;
    Library(){
    this.books=new ArrayList<>();
    }
void add_Books(String...book_name){    
    for(int i=0;i<book_name.length;i++){
    books.add(book_name[i]);
    System.out.println("Book Added : "+book_name[i]);
    }
}
void remove_Books(String...book_name){
    for(int i=0;i<book_name.length;i++){
        if(books.contains(book_name[i])){
        books.remove(book_name[i]);
        System.out.println("Book Removed : "+book_name[i]);
    }
    else System.out.println("Book not Found : "+book_name[i]);
    }
}
void display_Collection(){
System.out.println("Available Collection : "+this.books);
}
}
