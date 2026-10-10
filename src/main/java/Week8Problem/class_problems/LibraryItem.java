package Week8Problem.class_problems;
import java.time.LocalDate;

abstract class LibraryItem {
    String title;

    LibraryItem(String title) {
        this.title = title;
    }

    abstract int getBorrowDays();

    LocalDate getDueDate() {
        LocalDate currentDate = LocalDate.of(2023, 10, 26);
        return currentDate.plusDays(getBorrowDays());
    }
}

class Book extends LibraryItem {
    Book(String title) {
        super(title);
    }

    @Override
    int getBorrowDays() {
        return 14;
    }
}

class DVD extends LibraryItem {
    DVD(String title) {
        super(title);
    }

    @Override
    int getBorrowDays() {
        return 7;
    }
}

class Magazine extends LibraryItem {
    Magazine(String title) {
        super(title);
    }

    @Override
    int getBorrowDays() {
        return 3;
    }
    public static void main(String[] args) {

        LibraryItem[] items = {
            new Book("1984"),
            new DVD("The Matrix"),
            new Magazine("Forbes Issue 500")
        };

        for (int i = 0; i < items.length; i++) {
            System.out.println(
                items[i].title + ": " + items[i].getDueDate()
            );
        }
    }
}