import java.io.FileNotFoundException;

public class regexSearch {
    
    public static int[] main(String inputStr) throws FileNotFoundException
    {
        int[] fileCount = new int[3];
        String wordsList = "";
    
        for(int i =0; i < 3; i++)
        {
            wordsList = Files.main(i);
    
            int count = wordsList.split(inputStr).length - 1;
            fileCount[i] = count;
            }
        
        return fileCount;
    }


}
