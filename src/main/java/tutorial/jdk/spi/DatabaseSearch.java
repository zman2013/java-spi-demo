package tutorial.jdk.spi;

import java.util.List;

public class DatabaseSearch implements Search {

    @Override
    public List<Book> search(String keyword) {
        System.out.println("now use database search. keyword: " + keyword);
        return null;
    }

}
