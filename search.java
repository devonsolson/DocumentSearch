
public class search {
    public static int[] main(String selection, String phrase) throws Exception {
        if (selection.equals("1")){
            int[] timesFound = stringSearch.main(phrase);
            return timesFound;
        }
        else if (selection.equals("2")){
            int[] timesFound = regexSearch.main(phrase);
            return timesFound;
        }
        else if (selection.equals("3")){
            int[] timesFound = indexedSearch.main(phrase);
            return timesFound;
        }
        else {
            throw new Exception("That was not a valid answer");
        }
}
}
