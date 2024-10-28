package iterview;
import java.util.TreeSet;
public class AutoCompletion {
    private final TreeSet<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

    public boolean addWord(String word) {
        return words.add(word);
    }

    public String[] getVariants(String prefix) {
        return words.subSet(prefix, prefix + Character.MAX_VALUE).toArray(new String[0]);
    }
}
// Этот код на Java реализует простую систему автозаполнения с использованием TreeSet. Вот что он делает:
//Класс AutoCompletion содержит TreeSet strings, который хранит строки в порядке без учета регистра.
//Метод addWord добавляет слово в набор и возвращает true, если слово было добавлено.
//Метод getVariants принимает префикс и возвращает массив строк, которые начинаются с этого префикса.