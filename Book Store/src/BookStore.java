import java.util.Scanner;

public class BookStore {
    static Scanner input = new Scanner(System.in);
    static String[]books = {"Java","C","Python"};
    static final double StudentDiscount=0.3;
    static final double TeacherDiscount=0.5;

    public static void main(String[] args) {
        System.out.println("-----WELCOME TO THE BOOK STORE-----");
        System.out.println("Which book do you want ?");
        String UserChoice = input.nextLine();

        if (books[0].toLowerCase().equals(UserChoice.toLowerCase())){
            System.out.println("You opted for "+books[0]+" Book.");
            CalculatePrice(books[0]);
        }
        else if (books[1].toLowerCase().equals(UserChoice.toLowerCase())){
            System.out.println("You opted for "+books[1]+" Book.");
            CalculatePrice(books[1]);
        }
        else if (books[2].toLowerCase().equals(UserChoice.toLowerCase())){
            System.out.println("You opted for "+books[2]+" Book.");
            CalculatePrice(books[2]);
        }
        else System.out.println("Sorry , We don't have that book.");
    }
    static void CalculatePrice(String BookName){
        System.out.println("Are you a Student or Teacher ?");
        String answer = input.nextLine();
        double price = 200;

        if (answer.toLowerCase().equals("teacher")){
            price = price-(price*TeacherDiscount);
            ShowPrice(price);
        }
        else if (answer.toLowerCase().equals("student")){
            price = price-(price*StudentDiscount);
            ShowPrice(price);
        }
        else System.out.println("Sorry we can't serve you");
    }

    static void ShowPrice(double price){
        System.out.println("Your total payable amount : "+price);
        System.out.println("-----THANK YOU FOR SHOPPING FROM OUR BOOKSTORE-----");
    }

}
