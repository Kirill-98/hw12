public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAutor,String surnameAutor) {
        this.nameAuthor  = nameAutor;
        this.surnameAuthor = surnameAutor;
    }
    public String getName(){
        return nameAuthor;
    }
    public String getSurname(){
        return surnameAuthor;
    }
    public String toString() {
        return nameAuthor + " " + surnameAuthor;
    }

}