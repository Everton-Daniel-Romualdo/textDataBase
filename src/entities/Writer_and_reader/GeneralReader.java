package entities.Writer_and_reader;

import java.io.*;
import java.nio.BufferOverflowException;
import java.util.ArrayList;
import java.util.List;

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

    /**
     * read the entire database
     * @param patch The text file patch
     * @param textSeparator The file text separtor
     * @return a list of a list containing the file data
     * @throws FileNotFoundException launched when file is not found
     * @throws IOException launched when there is any other error in reading
     */
    public List<List<String>> readEntireDatabaseToArray(String patch, String textSeparator)
           throws FileNotFoundException, IOException{

        List<List<String>> resp = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(patch))){
            String line = br.readLine();

            while(line != null){
                List<String> l = new ArrayList<>();
                for(String s : line.split(textSeparator)){
                    l.add(s);
                }
                resp.add(l);
                line = br.readLine();
            }
            return resp;
        }catch (FileNotFoundException e){
            throw new FileNotFoundException();

        }
        catch (IOException e){
            throw new IOException();
        }
    }


}
