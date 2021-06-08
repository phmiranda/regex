package br.com.phmiranda;

import br.com.phmiranda.util.ValidacaoBase;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        // comentário.
        ValidacaoBase validacaoBase = new ValidacaoBase();

        String validacaoBasicaNome = validacaoBase.validacaoBasica("11a22b33c");
        String validacaoBaseNumeroTelefone = validacaoBase.validacaoNumeroPadrao("+5561985971259");

        // comentário.
        //System.out.println("VALIDAÇÃO BÁSICA DE NOME: " + validacaoBasicaNome);
        //System.out.println("VALIDAÇÃO BÁSICA DE TELEFONE (CELULAR): " + validacaoBaseNumeroTelefone);
    }
}
