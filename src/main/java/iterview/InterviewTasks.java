package iterview;

import java.util.HashSet;

public class InterviewTasks {
    static public boolean hasSumTwo(int[] array, int sum) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        while (i < array.length && !set.contains(sum - array[i])) {
            set.add(array[i++]);
        }
        return i != array.length;
    }  
}
static public int getMaxWithNegativePresentation(int [] array) {
    //TODO
    //returns maximal positive value for which exists negative one with the same abs value
    //if no pair of positive and negative values with the same abs value the method returns -1
    //complexity O[N] only one pass over the elements
    throw new UnsupportedOperationException();
}
public static List<DateRole> assignRoleDates(List<DateRole> rolesHistory,
    List<LocalDate> dates) {
//TODO
//rolesHistory is the list containg dates and roles assigned to the employees at the appropriate dates
//for example, date => 2019-01-01, role => Developer means that some employee (no matter who) was taken
//role Developer at 2019-01-01
//create List<DateRole> with roles matching with the given dates
//most effective data structure
throw new UnsupportedOperationException();
}
public static boolean isAnagram(String word, String anagram) {
//TODO
//returns true if "anagram" string contains all
// letters from "word" in another order (case sensitive)
//O[N] (sorting is disallowed)
throw new UnsupportedOperationException();
}

}