import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {
    public static String main(int count) throws FileNotFoundException {
        
        String[] listFiles = {"french_armed_forces.txt", "hitchhikers.txt", "warp_drive.txt"};
        File file = new File(listFiles[count]);
        Scanner scanner = new Scanner(file);

        String fileContent = "";
        while(scanner.hasNextLine()) {
            fileContent = fileContent.concat(scanner.nextLine() + "\n");
        }
        scanner.close();
        return fileContent;

    }
}