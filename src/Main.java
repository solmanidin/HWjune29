public class Main {
    public static void main(String[] args) {
    author autor1= new author("Питер","Хёгг");
     book book1= new book("Твоими глазами",2011,autor1);
    author autor2= new author("Николай","Лесков");
     book book2= new book("Железная воля",2007,autor2);
    author autor3= new author("Венедикт","Ерофеев");
     book book3= new book("Записные книжки",2007,autor3);
        book2.setYear(2022);
        System.out.println("Название книги - " + book2.getName() + ", автор " + book2.getAuthor().getName()+" "+ book2.getAuthor().getSurName()+", год издания "+book2.getYear());
        System.out.println("Название книги - " + book3.getName() + ", автор " + book3.getAuthor().getName()+" "+ book3.getAuthor().getSurName()+", год издания "+book3.getYear());
        System.out.println("Название книги - " + book1.getName() + ", автор " + book1.getAuthor().getName()+" "+ book1.getAuthor().getSurName()+", год издания "+book1.getYear());
    }
}