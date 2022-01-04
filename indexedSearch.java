import java.io.*;
import java.util.HashMap;
import java.util.Map;
 
class indexedSearch {
    public static int[] main(String term) throws FileNotFoundException
    {
        int[] fileCount = new int[3];

        for(int i =0; i < 3; i++) {
        String wordsList = Files.main(i);

        Map<String, Integer> map = new HashMap<>();
        String[] words = wordsList.split(" ");
 
        for (String value : words) {

            Integer intCount = map.get(value);
 
            if (intCount == null)
            map.put(value, 1);
 
            else {
                map.put(value, intCount + 1);
            }
        }
        int value = map.get(term);
        fileCount[i] = value;
    }
        return fileCount;
    }
}