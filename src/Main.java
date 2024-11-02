public class Main {
    public static void main(String[] args) {
        Author tolstoyL = new Author("Лев","Толстой");
        Author pushkinA = new Author("Александр","Пушкин");
        Book warAndPeace = new Book("Война и мир",1865 ,tolstoyL);
        Book eugeneOnegin = new Book("Евгений Онегин",1823,pushkinA);

        System.out.println("eugeneOnegin.getName() = " + eugeneOnegin.getName());
        System.out.println("eugeneOnegin.getAuthor() = " + eugeneOnegin.getAuthor());
        System.out.println("eugeneOnegin.getYear() = " + eugeneOnegin.getYear());
        System.out.println();
        System.out.println("warAndPeace.getName() = " + warAndPeace.getName());
        System.out.println("warAndPeace.getAuthor() = " + warAndPeace.getAuthor());
        System.out.println("warAndPeace.getYear() = " + warAndPeace.getYear());
        System.out.println();
        warAndPeace.setYear(1950);
        System.out.println("warAndPeace.getYear() = " + warAndPeace.getYear());
    }
}