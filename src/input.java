import java.util.Scanner;

public class input {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = "";
        int result = 0;

        // Integer values
        System.out.println("Write a number, I will multiply it by 10");
        input = in.nextLine();
        result = Integer.parseInt(input) * 10;
        // can them " Integer.parseInt(input)" vao phan result, boivi console nghi la
        // khi ng khac type value nao do vao thi tat ca dc cho thanh String value( like
        // symbo or character) luc do no se ko tu tinh duoc nen phai cho phan nay vao de
        // doi values tu "string value" to "integer value"

        System.out.println(result);

        // System.out.println("Please type something. I will then write it to the
        // console");
        // // input = "Hello";
        // input = in.nextLine();
        // System.out.println("You type" + input);

        // HUOMMMMM!!
        // double result = 0;
        // --> result = Double.parseDouble(input) * 10;
        in.close();
    }
}