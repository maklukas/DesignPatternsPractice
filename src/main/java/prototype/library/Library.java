package prototype.library;

import prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = "    Library [" + name + "]\n";

        for (Book b: books) {
            s = s + b + '\n';
        };

        return s;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library copiedLibrary = (Library) super.clone();
        copiedLibrary.books = new HashSet<>();
        for (Book theBook: books) {
            copiedLibrary.getBooks().add(new Book(theBook.getTitle(), theBook.getAuthor(), theBook.getPublicationDate()));
        }
        return  copiedLibrary;
    }
}
