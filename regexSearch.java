import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexSearch {
    
    public static int[] main(String inputStr) throws FileNotFoundException
    {
        int[] fileCount = new int[3];
        String wordsList = "";
            
        for(int i =0; i < 3; i++)
        {
            int count = 0;
            wordsList = Files.main(i);
    
            Pattern pattern = Pattern.compile((inputStr));
            Matcher mmatchingList = pattern.matcher(wordsList);

            while(mmatchingList.find()){
            count++;
        }
            fileCount[i] = count;
            }
        
        return fileCount;
    }


}