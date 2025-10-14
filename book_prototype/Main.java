package book_prototype;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part 2)\n");

        BookShallowCopy bookShallowCopy = new BookShallowCopy(
                "Clean Code",
                "Robert C. Martin",
                new ArrayList<>(Arrays.asList("Chapter 1", "Chapter 2"))
        );
        BookShallowCopy bookShallowCopyClone = (BookShallowCopy) bookShallowCopy.clone();
        bookShallowCopy.getChapters().add("Chapter 3");
        bookShallowCopy.getChapters().add("Chapter 4");

        System.out.println("Book Shallow Copy - " + bookShallowCopy);
        System.out.println("Book Shallow Copy Clone - " + bookShallowCopyClone);

        System.out.println("\nPart 3)\n");

        BookDeepCopy bookDeepCopy = new BookDeepCopy(
                "Design Patterns Elements of Reusable Object-Oriented Software",
                "Erich Gamma et al.",
                new ArrayList<>(Arrays.asList("Chapter 1", "Chapter 2"))
        );
        BookDeepCopy bookDeepCopyClone = (BookDeepCopy) bookDeepCopy.clone();
        bookDeepCopy.getChapters().add("Chapter 3");
        bookDeepCopy.getChapters().add("Chapter 4");

        System.out.println("Book Deep Copy - " + bookDeepCopy);
        System.out.println("Book Deep Copy Clone - " + bookDeepCopyClone);
    }
}
