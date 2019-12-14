package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.util.StringUtils;

public class MatchTest {
public static void main(String[] args) {
    String a = "?a?b?c";
    System.out.println(org.apache.commons.lang3.StringUtils.countMatches(a, "?"));
//    Pattern pattern = Pattern.compile("[\\?]");
//    Matcher matcher = pattern.matcher(a);
//    System.out.println(matcher.find());
//    System.out.println(matcher.group());
//    int c = 0;
//    while(matcher.find()){
//        System.out.println(matcher.group());
//        c++;
//    }
//    StringUtils.cou
//    System.out.println(c);
}
}
