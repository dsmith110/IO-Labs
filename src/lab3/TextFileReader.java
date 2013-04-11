/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author dskrilla24
 */
public class TextFileReader implements FileReaderStrategy {
    private File data;
    private String[] textRecord;

    public TextFileReader(String filePath) {
        data = new File(filePath);
    }
    
    
    @Override
    public void searchTextFile(int fileNumber) {
        BufferedReader in = null;

        int counter = 0;
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            counter++;
            while (line != null) {
                if (counter == fileNumber) {
                    String[] fileData = line.split("\\|");
                    textRecord = fileData;
                }
                line = in.readLine();  // strips out any carriage return chars
                counter++;
            }
        } catch (IOException ioe) {
            System.out.println("Houston we have a problem");
        }
    }

    @Override
    public String getRecordName() {
        return textRecord[0] + ", " + textRecord[1];
    }

    @Override
    public void setFilePath(String filePath) {
        data = new File(filePath);
    }

    @Override
    public String getRecordCity() {
        return textRecord[3];
    }
    
}
