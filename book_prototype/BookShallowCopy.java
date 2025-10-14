package book_prototype;
import java.util.List;

public class BookShallowCopy extends Book {
    public BookShallowCopy(String title, String author, List<String> chapters) {
        super(title, author, chapters);
    }

    @Override
    public Object clone(){
        return super.clone();
    }
}