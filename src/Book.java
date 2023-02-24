public class Book {
    private String name;
    private double price;
    private Author author;
    private  int qty=0;

    public Book(String name, double price, Author author) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty = qty;
    }
    public  Book(String kelkel, double v, String s, String s1, char m, int i){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author=" + author +
                ", qty=" + qty +
                '}';
    }
}
