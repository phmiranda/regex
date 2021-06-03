/**
 * User: Pedro
 * Project: regex
 * Description: N/A
 * Date: 02/06/2021
 */

package br.com.phmiranda.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateBaseUtil {
    public void validate(String string) {
        Pattern pattern = Pattern.compile("(\\d\\d)(\\w)");
        Matcher matcher = pattern.matcher(string);
        // Boolean matchers = matcher.find();
        while(matcher.find()) {
            String match = matcher.group();
            String group1 = matcher.group(1);
            String group2 = matcher.group(2);
            Integer start = matcher.start();
            Integer finish = matcher.end();
            System.out.printf("%s | %s | %s [%d,%d] %n", match, group1, group2, start, finish);
        }
    }

    public void validateDate(String date) {

    }

    public void validateDocument() {

    }

    public void validateName() {

    }
}
