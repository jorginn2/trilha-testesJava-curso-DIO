public class FormatadorDeCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("09854379116");
                System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O CEP não foi inserido corretamente!");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{

        if(cep.length() != 8)
           throw new CepInvalidoException(); 
                return "071.971.999-07";  
    }
}
