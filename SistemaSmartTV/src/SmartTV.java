import java.util.Scanner;

public class SmartTV {

        public boolean ligada = false;
            public int canal=1;
                public int volume = 25;

    public void ligar(){
        ligada=true;
    } 
    public void desligar(){
        ligada=false;
    }
    public void aumentarVolume(){
        volume++;
            System.out.println("Aumentando o volume: "+volume);
    }
    public void diminuirVolume(){
        volume--;
            System.out.println("Diminuindo o volume: "+volume);
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(){
        int novoCanal;
            Scanner entrada = new Scanner(System.in);
                System.out.println("Insira o número do canal: ");
                    novoCanal = entrada.nextInt();
                        canal = novoCanal;
    }
}

