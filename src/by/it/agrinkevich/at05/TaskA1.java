package by.it.agrinkevich.at05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яА-яёЁ]{4,}");
        Matcher matcher = pattern.matcher(sb);
        while (matcher.find()) {
            System.out.println(matcher.group());
            int start = matcher.start();
            sb.setCharAt(start + 3, '#');
            if (matcher.group().length() > 6)
                sb.setCharAt(start + 6, '#');
        }
        System.out.println(sb);
    }

}
