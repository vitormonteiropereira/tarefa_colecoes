import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> listaNomes = new TreeSet<>();

        System.out.println("Digite uma lista de nomes separados por vírgula: ");
        String nome = scanner.nextLine();
        String [] parts = nome.split(",");

        for (String a : parts){
            listaNomes.add(a.trim());
        }

        System.out.println("A lista de nomes em ordem alfabetica: ");
        for (String b : listaNomes) {
            System.out.println(b);
        }
    }
}