package prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //given
        Library library = new Library("Test Library 1");

        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Title number " + n,
                        "Author number " + n, LocalDate.of(2021-n, n, n))));

        Book b = new Book("T", "T", LocalDate.now());
        library.getBooks().add(b);
        Library shallowCopyLibrary = null;

        try {
            shallowCopyLibrary = library.shallowCopy();
            shallowCopyLibrary.setName("Test Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCopyLibrary = null;

        try {
            deepCopyLibrary = library.deepCopy();
            deepCopyLibrary.setName("Test Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library.getBooks().remove(b);
        //then
        System.out.println(library);
        System.out.println(shallowCopyLibrary);
        System.out.println(deepCopyLibrary);
        Assert.assertEquals(10, library.getBooks().size());
        Assert.assertEquals(10, shallowCopyLibrary.getBooks().size());
        Assert.assertEquals(11, deepCopyLibrary.getBooks().size());
        Assert.assertNotEquals(library.getBooks(), deepCopyLibrary.getBooks());

    }
}