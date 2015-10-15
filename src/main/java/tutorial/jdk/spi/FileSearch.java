package tutorial.jdk.spi;

import java.util.Collections;
import java.util.List;

public class FileSearch implements Search {

    @Override
    public List<Book> search(String keyword) {
        System.out.println(" now use file system search. keyword: " + keyword);
        return Collections.emptyList();
    }

}
