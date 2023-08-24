import java.util.Scanner;
public class TesteTerminal{

       public static void main(String[] args) throws InterruptedException{
        
        Scanner entrada= new Scanner(System.in);
         
          String nome;

            System.out.println("Teste terminal, fui executado pelo ms-dos");
             
              System.out.println("Insira seu nome: ");
                nome = entrada.nextLine();
                  Thread.sleep(2000);  
                    System.out.println(nome);
      }
}