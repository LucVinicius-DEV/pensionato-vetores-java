import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante[] quartos = new Estudante[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine(); // Limpar buffer

        for (int i = 1; i <= n; i++) {
            System.out.println("\nRent #" + i + ":");
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int quarto = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            quartos[quarto] = new Estudante(nome, email);
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }

        sc.close();
    }
}
