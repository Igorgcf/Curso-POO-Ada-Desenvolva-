package Class08;

public class BookstoreItems {

    private String title;
    private String author;
    private String publicationDate;

    public BookstoreItems(String title, String author, String publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public boolean nameContains(String name) {
        return title.contains(name);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void displayItems() {
            System.out.println("Título: " + getTitle());
            System.out.println("Autor: " + getAuthor());
            System.out.println("Data de publicação: " + getPublicationDate());
            System.out.println("-------------------------------");
        }
    }