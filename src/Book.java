public class Book {
    String title, author, publisher, date;

    public Book(String title, String date, String publisher, String author) {
        this.title = title;
        this.date = date;
        this.publisher = publisher;
        this.author = author;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return getTitle()+" was written by "+getAuthor()+", published by "+getPublisher()+ " and was copyrighted on "+getDate();
    }

}
