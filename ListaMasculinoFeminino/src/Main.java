import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();
        int x = 1;

        while (x==1) {

            System.out.println("Digite o nome e o sexo para adicionar a lista no seguiinte modelo: Nome - (M/F)");
            String dados = scanner.nextLine();
            String [] parts = dados.split("-");

            String nome = parts[0].trim();
            String sexo = parts[1].trim();

            if (sexo.equalsIgnoreCase("f")) {
                feminino.add(nome);

            }
            else if (sexo.equalsIgnoreCase("m")) {
                masculino.add(nome);
            }
            else {
                System.out.println("Digito para informar o sexo invalido, tente novamente");
            }

            System.out.println("Deseja adicionar outra pessoa?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            x = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("A lista de pessoas do sexo masculino: ");
        for (String a : masculino){
            System.out.println(a);
        }
        System.out.println("A lista de pessoas do sexo feminino:");
        for (String b : feminino){
            System.out.println(b);
        }
        scanner.close();
    }
}