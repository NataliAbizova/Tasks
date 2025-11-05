package H1_task_2;

public class Book {

    private String title;
    private int publication;
    private int numberOfPages;

    Book(String title, int  publication, int numberOfPages) {
        this.title = title;
        this.publication = publication;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public int getPublication() {
        return publication;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }

}
