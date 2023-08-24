public class Usuario {
    public static void main(String[] args) throws Exception {
        
          SmartTV smartTv = new SmartTV();

            System.out.println("TV ligada: "+smartTv.ligada);
                System.out.println("Canal atual: "+smartTv.canal);    
                    System.out.println("Volume: "+smartTv.volume);
        
            smartTv.ligar();
                System.out.println("Tv ligada: "+smartTv.ligada);   
                    smartTv.desligar();
                        System.out.println("TV ligada: "+smartTv.ligada); 
        
                smartTv.aumentarVolume();
                    smartTv.aumentarVolume();
                        smartTv.aumentarVolume();   
                            smartTv.diminuirVolume();    
                                System.out.println("Volume: "+smartTv.volume);
                    
                smartTv.mudarCanal();
                    System.out.println("Canal: "+smartTv.canal);
                  
    }
}
