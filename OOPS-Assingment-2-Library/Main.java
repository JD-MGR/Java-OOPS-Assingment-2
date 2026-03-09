
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
    Library lib=new Library();
    lib.add_Books("The Great Gatsby","1984","To Kill a Mockingbird","The Hobbit","Java: The Complete Reference","Clean Code","Data Structures and Algorithms in Java","Introduction to SQL");
    lib.display_Collection();
    lib.remove_Books("Java: The Complete Reference","Clean Code","Data Structures and Algorithms in Java","Introduction to SQL");
    lib.display_Collection();
    lib.remove_Books("Java: The Complete Reference");
}
}