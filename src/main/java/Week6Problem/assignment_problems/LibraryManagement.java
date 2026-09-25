package Week6Problem.assignment_problems;

public class LibraryManagement {
    static class BookInventory {
        String title;
        String author;
        int copiesAvailable;
    
    public BookInventory(String title,String anthor,int copiesAvailable){
        this.title = title;
        this.author = anthor;
        this.copiesAvailable = copiesAvailable;

    }
    void printEntry(){
        System.out.print(title +" by " + author +" - " + copiesAvailable + " copies available\n");
    }
    }

    public static void main(String[] args) {
        BookInventory [] books = {new BookInventory("Clean code","Robert C. Martin",3),
        new BookInventory("Effective java","Joshua Bloch",5),
        new BookInventory("Refactoring","Martin Fowler",0),
        new BookInventory("Design Patterns","GoF",2)

    };
    for(BookInventory book : books){
        book.printEntry();
    }
}
}