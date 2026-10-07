class book{
  String title;
  String author_name;
  int price;


book(String title, String author_name, int price){
  this.title = title;
  this.author_name = author_name;
  this.price = price;

}
void display(){
  System.out.println("Title : " + title);
  System.out.println("Author : " + author_name);
  System.out.println("Price : " + price);
}
}

public class question1{
  public static void main(String[] args){

    book b1 = new book("DRACULA", "Bram Stoker", 1099);
    b1.display();
  }
}


