public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Vince Arnold Sevilla");
        LibraryResource book = new Book("Fundamentals of Programming");
        LibraryResource journal = new Journal("Programming");

        student.borrowResource(book);
        student.borrowResource(journal);
    }
}
