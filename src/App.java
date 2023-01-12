import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner n = new Scanner(System.in);
        String name;
        String phone;
        String email;
        String courseName;
        String college;
        String state;
        int admissionYear;
        int admissionSemester;
        
        System.out.println("Digite o seu nome: ");
        name = n.next();
        
        System.out.println("Digite seu telefone: ");
        phone = n.next();
        
        System.out.println("Digite seu email: ");
        email = n.next();

        
        System.out.println("Informe os dados do seu curso de graduação:");
        System.out.println("Curso:");
        courseName = n.next();

        System.out.println("Universidade");
        college = n.next();

        System.out.println("Estado:");
        state = n.next();

        System.out.println("Ano de ingresso na universidade:");
        admissionYear = n.nextInt();

        System.out.println("Período de ingresso na universidade:");
        admissionSemester = n.nextInt();
        
        User user = new User(name, phone, email, courseName, college, state, admissionYear, admissionSemester);    
    
        System.out.println("Digite o plano de assinatura desejado: ");
        user.plan.setType(n.next());
        System.out.println("Valor do plano escolhido por " + user.getName());
        System.out.println(user.plan.getValue());
    }
}
