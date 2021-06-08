/**
 * User: Pedro
 * Project: regex
 * Description: N/A
 * Date: 02/06/2021
 */

package br.com.phmiranda.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacaoBase {
    public String validacaoBasica(String nome) {
        Pattern pattern = Pattern.compile("(\\d\\d)(\\w)");
        Matcher matches = pattern.matcher(nome);
        // Boolean matchers = matcher.find();
        while(matches.find()) {
            String match = matches.group();
            String group1 = matches.group(1);
            String group2 = matches.group(2);
            Integer start = matches.start();
            Integer finish = matches.end();
            System.out.printf("%s | %s | %s [%d,%d] %n", match, group1, group2, start, finish);
        }
        return nome;
    }

    public String validacaoNumeroPadrao(String numero) {
        // recebe a STRING e validação conforme o padrão do REGEX.
        Pattern pattern = Pattern.compile("\\+[0-9]{2}\\s[0-9]{2,3}\\s[0-9]{4,5}-?[0-9]{4}");
        Matcher matches = pattern.matcher(numero);

        // caso encontre um resultado com a STRING recebida como parâmetro no LOOP, retona ao usuário
        while(matches.find()) {
            String resultados = matches.group();
            System.out.println("RESULTADOS ENCONTRADOS: " + resultados);
        }
        return numero;
    }
}
