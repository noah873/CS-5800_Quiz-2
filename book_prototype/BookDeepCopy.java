package book_prototype;
import java.util.List;
import java.util.ArrayList;

public class BookDeepCopy extends Book {
    public BookDeepCopy(String title, String author, List<String> chapters) {
        super(title, author, chapters);
    }

    @Override
    public Object clone() {
        List<String> deepClonedChapters = new ArrayList<>(getChapters());
        return new BookDeepCopy(getTitle(), getAuthor(), deepClonedChapters);
    }
}