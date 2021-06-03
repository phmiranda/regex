package br.com.phmiranda;

import br.com.phmiranda.util.ValidateBaseUtil;
import br.com.phmiranda.validate.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ValidateBaseUtil validateBaseUtil = new ValidateBaseUtil();
        ValidacaoNomeCompletoUsuario validaNomeUsuario = new ValidacaoNomeCompletoUsuario();
        ValidacaoTelefoneCelular validacaoTelefoneCelular = new ValidacaoTelefoneCelular();
        ValidacaoTelefoneFixo validacaoTelefoneFixo = new ValidacaoTelefoneFixo();
        ValidacaoDocumentoPessoal validacaoDocumentoPessoal = new ValidacaoDocumentoPessoal();
        ValidacaoData validacaoData = new ValidacaoData();

        validateBaseUtil.validate("11a22b33c");
        validaNomeUsuario.validaNomePessoal();
        validacaoTelefoneCelular.validaTelefoneCelular();
        validacaoTelefoneFixo.validaTelefoneFixo();
        validacaoDocumentoPessoal.validaDocumentoPessoal();
        validacaoData.validaDataDeNascimento();


        System.out.println("RESULTADO: " + validateBaseUtil);
        System.out.println("VALIDAÇÃO DO NOME: " + validaNomeUsuario);
        System.out.println("VALIDAÇÃO DO DOCUMENTO: " + validacaoDocumentoPessoal);
        System.out.println("VALIDAÇÃO DO NÚMERO FIXO: " + validacaoTelefoneFixo);
        System.out.println("VALIDAÇÃO DO NÚMERO DE CELULAR: " + validacaoTelefoneCelular);
        System.out.println("VALIDAÇÃO DO DATA DE NASICMENTO: " + validacaoData);
    }
}
