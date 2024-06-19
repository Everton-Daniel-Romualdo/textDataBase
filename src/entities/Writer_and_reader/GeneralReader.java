package entities.Writer_and_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * General reading classs
 * responsible for reading data from the database
 * @author Everton Daniel
 */
public class GeneralReader {

    public GeneralReader() {

    }

    /**
     * read the entire database
     * @param patch the text file patch
     * @return the entire database in String format or one String "ERROR" if its fails
     */
    public String readEntireDataBase(String patch){
        String dataBase = "";
        try(BufferedReader br = new BufferedReader(new FileReader(patch))){
            String line = br.readLine();
            while(line != null){
                dataBase += line + "\n";
                line = br.readLine();
            }
            return dataBase;
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
            return "ERROR";
        }
    }
}
