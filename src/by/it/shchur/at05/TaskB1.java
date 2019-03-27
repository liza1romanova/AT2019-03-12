package by.it.shchur.at05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher=p.matcher(Poem.text);
        while (matcher.find()){
            String word=matcher.group();
            if (check(word))
                System.out.println(word);
        }
    }
    private static final String vow="ёуеыаоэяиюЁУЕЫАОЭЯИЮ";

    private  static boolean check(String word){
        boolean first=vow.indexOf(word.charAt(0))<0;
        boolean last=vow.indexOf(word.charAt(word.length()-1))>=0;
        return first && last;
    }
}
