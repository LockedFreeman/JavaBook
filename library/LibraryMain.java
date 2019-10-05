package library;

import java.util.Scanner;

public class LibraryMain {

    static Scanner scanner = new Scanner(System.in);
    static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            System.out.println("Մեր հրամանները։");
            System.out.println("0 - Դուրս գալ");
            System.out.println("1 - Ավելացնել գիրք։");
            System.out.println("2 - Տպել բոլոր գրքերը։");
            System.out.println("3 - Փնտրել գիրք։");
            System.out.println("4 - nermucel hexinaki tvyalner@");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addBook();
                    break;
                case "2":
                    bookStorage.print();
                    break;
                case "3":
                    searchBook();
                    break;
                case "4":
                   addAhtor();

                default:
                    System.out.println("սխալ հրաման");
            }
        }

    }

    private static void addAhtor() {

    }

    static void addBook() {
        System.out.println("Ներմուծեք գրքի տվյալները։ title,description,price,authorName");
        String bookStr = scanner.nextLine();
        String[] split = bookStr.split(",");
        String[] bookData = split;
        Book book = new Book();
        book.setTitle(bookData[0]);
        book.setDescription(bookData[1]);
        book.setPrice(Double.parseDouble(bookData[2]));
        book.setAuthorName(bookData[3]);
        bookStorage.add(book);
        System.out.println("Գիրքը ավելացվել է, Շնորհակալություն");
    }

    static void searchBook() {
        System.out.println("Ներմուծեք փնտրվող բառը");
        String keyword = scanner.nextLine();
        bookStorage.search(keyword);
    }

}
