public class Journal implements LibraryResource {
    private String title;
    public Journal(String title) { this.title = title; }

    @Override
    public String getTitle() { return title; }

    @Override
    public void borrow() {
        System.out.println("Borrowing journal: " + title);
    }
}