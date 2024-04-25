package aulas.anatomiadasclasses;
public class MinhaClasse {
    
    public static void main(String[] args) {
        String primeiroNome = " Elisson ";
        String segundoNome = "Neves";

        String nomeCompleto = nomeCompeto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
}

public static String nomeCompeto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
}
}
