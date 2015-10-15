package demo;

import java.util.Iterator;
import java.util.ServiceLoader;

import tutorial.jdk.spi.Search;

public class Demo {

    public static void main(String[] args) {
        ServiceLoader<Search> s = ServiceLoader.load(Search.class);
        Iterator<Search> searchs = s.iterator();

        if (!searchs.hasNext()) {
            System.out.println("there is no implementation for interface Search.");
        }

        while (searchs.hasNext()) {
            Search search = searchs.next();
            search.search("test");
        }
    }
}
