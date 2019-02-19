public class Book {


    private String autor;

    private String name;

    public Book(String autor, String name) {

        this.autor = autor;
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return book.autor.equals(this.autor) && book.name.equals(this.name);
    }


    @Override
    public String toString() {
        return "Book{" +
                "autor='" + autor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
