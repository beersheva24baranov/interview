package iterview;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewTasks {
    static public boolean hasSumTwo(int[] array, int sum) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        while (i < array.length && !set.contains(sum - array[i])) {
            set.add(array[i++]);
        }
        return i != array.length;
    }  

static public int getMaxWithNegativePresentation(int [] array) {
int res = -1;
        int elementAbs = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int element : array) {
            elementAbs = Math.abs(element);
            if (set.contains(-element)) {
                res = elementAbs > res ? elementAbs : res;
            } else {
                set.add(element);
            }
        }
        return res;
    }
public static List<DateRole> assignRoleDates(List<DateRole> rolesHistory,
    List<LocalDate> dates) {
 TreeMap<LocalDate, String> map = new TreeMap<>();
        List<DateRole> res = new ArrayList<DateRole>();
        rolesHistory.stream().forEach(dr -> map.put(dr.date(), dr.role()));
        dates.stream().forEach(d -> res.add(new DateRole(d, map.floorKey(d) != null ? map.get(map.floorKey(d)) : null)));
        return res;
    }
public static boolean isAnagram(String word, String anagram) {
boolean res = false;
        if (word.length() == anagram.length() && word != anagram) {
            res = Objects.equals(getMapFromString(word), getMapFromString(anagram));
        } 
        return res;
    }
 private static Map<Integer, Long> getMapFromString(String word) {
        return word.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}