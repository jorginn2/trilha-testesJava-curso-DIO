public class ResultadoEscolar {
    
    public static void main(String[] args) {
        
        int nota = 5;
        /*condi��o encadeada
        if(nota>=7)
            System.out.println("Aluno Aprovado");
                 else if(nota>=5 && nota <7)         
                    System.out.println("Recupera��o");
                        else
                            System.out.println("Reprovado");
        */
          //condi��o tern�ria
        String resultado = nota>=7 ? "Aprovado" : nota>=5 && nota<=7 
        ? "Recupera��o" : "Reprovado";
                System.out.println(resultado);
    }
}
