import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program_Exception {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите данные(Ф.И.О, дата рождения, номер телефона, пол):");

        try {
            String input = sc.nextLine();
            String[] data = input.split(" ");

            String person = data[0];
            String date_of_birth = data[1];
            String number = data[2];
            String gender = data[3];

            String file = person + ".txt";
            FileWriter filewriter = new FileWriter(file, true);

            filewriter.write(person + " " + date_of_birth + " " + number + " " + gender);

            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}