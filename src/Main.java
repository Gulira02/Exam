public class Main {
    public static <Books> void main(String[] args)
    {
        Book book1=new Book("Kelkel",922.34,new Author("Tologon Kasymbekov","tologon1@gmail.com",'m',123));
        Book book2=new Book("Esine Kaitkan Rosa",726.34, new Author("Nurjigit","nurjigit@gmail.com",'m',1223));
        Book book3=new Book("Sen",124.34, new Author("Serrary@mail.com","nur@gmail.com",'m',345));


        Book[] books={book1,book2,book3};
        for (Book book:books) {
            System.out.println(book);
        }


    }
}