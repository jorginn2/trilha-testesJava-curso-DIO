import java.util.Scanner;
public class TesteTerminal{

       public static void main(String[] args) throws InterruptedException{
        
         String nome;

            System.out.println("Teste terminal, fui executado pelo ms-dos");
             Scanner entrada= new Scanner(System.in);
             System.out.println("Insira seu nome: ");
             nome = entrada.nextLine();
              Thread.sleep(2000);  
             System.out.println(nome);
            
             }

}