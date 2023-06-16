package example;

/**
 * Cette classe représente un livre.
 */
public class Book {
    private String title;
    private String author;
    private String publicationDate;

    /**
     * Constructeur de la classe Book.
     *
     * @param title           Le titre du livre.
     * @param author          L'auteur du livre.
     * @param publicationDate La date de publication du livre.
     */
    public Book(String title, String author, String publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    /**
     * Récupère le titre du livre.
     *
     * @return Le titre du livre.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Définit le titre du livre.
     *
     * @param title Le titre du livre.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Récupère l'auteur du livre.
     *
     * @return L'auteur du livre.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Définit l'auteur du livre.
     *
     * @param author L'auteur du livre.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Récupère la date de publication du livre.
     *
     * @return La date de publication du livre.
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Définit la date de publication du livre.
     *
     * @param publicationDate La date de publication du livre.
     */
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
}
