import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        
            try{
            Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

                System.out.println("Insira o primeiro nome: ");
                    String primeiroNome = entrada.nextLine();
                
                System.out.println("Insira o seu segundo nome: ");
                    String sobrenome = entrada.nextLine();

                System.out.println("Insira a sua idade: ");
                    int idade = entrada.nextInt();
                
                System.out.println("Insira a sua altura: ");
                    double altura = entrada.nextDouble();
                    entrada.close();
                System.out.println("Olá, me chamo "+primeiroNome.toUpperCase()+sobrenome.toUpperCase());
                    System.out.println("Possuo "+idade+" anos");
                        System.out.println("E tenho "+altura+" cm de altura");
            } catch(InputMismatchException e){
                    System.out.println("Os campos idade e altura não foram inseridos corretamente!");
            }           
    }
}
