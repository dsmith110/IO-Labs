package lab4;

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
    public void searchTextFile(int fileNumber) throws IOException {
        BufferedReader in = null;
        if (data == null || data.length() == 0) {
            throw new IOException(IO_ERR_MSG);
        } else {
            int counter = 0;
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            counter++;
            while (line != null) {
                if (counter == fileNumber) {
                    textRecord = line.split("\\|");
                }
                line = in.readLine();  // strips out any carriage return chars
                counter++;
            }
        }
        
    }

    @Override
    public String getRecordName() throws NullPointerException {
        if(textRecord == null) {
            throw new NullPointerException(NPE_ERR_MSG);
        }
        return textRecord[0] + ", " + textRecord[1];
    }

    @Override
    public void setFilePath(String filePath) throws NullPointerException {
        if(textRecord == null) {
            throw new NullPointerException(NPE_ERR_MSG);
        }
        data = new File(filePath);
    }

    @Override
    public String getRecordCity() throws NullPointerException {
        if(textRecord == null) {
            throw new NullPointerException(NPE_ERR_MSG);
        }
        return textRecord[3];
    }

    @Override
    public String getRecordState() throws NullPointerException {
        if(textRecord == null) {
            throw new NullPointerException(NPE_ERR_MSG);
        }
        return textRecord[4];
    }

    @Override
    public String getRecordStreetAddress() throws NullPointerException {
        if(textRecord == null) {
            throw new NullPointerException(NPE_ERR_MSG);
        }
        return textRecord[2];
    }

    @Override
    public String getRecordZip() throws NullPointerException {
        if(textRecord == null) {
            throw new NullPointerException(NPE_ERR_MSG);
        }
        return textRecord[5];
    }
    
}
