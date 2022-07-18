
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object comp) {
        if (this == comp) {
            return true;
        }

        if (!(comp instanceof Book)) {
            return false;
        }

        Book compBook = (Book) comp;
        
        return (this.name.equals(compBook.name)) && (this.publicationYear == compBook.publicationYear);
    }

}
