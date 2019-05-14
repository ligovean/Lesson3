package task01;

import java.util.*;

public class WordsArray {
    public static void main(String[] args) {

        ArrayList<String> wordsList = new ArrayList();
        wordsList.add("Эквилибристика");
        wordsList.add("Дуриан");
        wordsList.add("Эквилибристика");
        wordsList.add("Билингвальный");
        wordsList.add("Эксцентриситет");
        wordsList.add("Хлеб");
        wordsList.add("Альбинос");
        wordsList.add("Керамика");
        wordsList.add("Кот");
        wordsList.add("Кит");
        wordsList.add("Скот");
        wordsList.add("Скит");
        wordsList.add("Кот");
        wordsList.add("Кавалергард");
        wordsList.add("Птеродактиль");
        wordsList.add("Кот");

        System.out.println("Список слов: " + wordsList);

        Set<String> wordsSet = new HashSet();
        Map<String,Integer> wordsHM = new HashMap();

        for (String wrd: wordsList) {
            wordsSet.add(wrd);
            Integer i = wordsHM.get(wrd);
            wordsHM.put(wrd, i == null?1: ++i);
        }

        System.out.println("Уникальные слова: " + wordsSet);
        System.out.println("Повтор слов: " + wordsHM.toString().replace("="," - "));





    }


}
