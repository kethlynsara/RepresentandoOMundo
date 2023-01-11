import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner n = new Scanner(System.in);

        User user = new User();
        
        System.out.println("Digite o nome do usuário: ");
        user.setName(n.next());
        System.out.println(user.getName());

        System.out.println("Digite o plano desejado: ");
        user.plan.setType(n.next());
        System.out.println("Valor do plano: ");
        System.out.println(user.plan.getValue());
    }
}
