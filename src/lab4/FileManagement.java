package lab4;

import java.io.IOException;


/**
 *
 * @author dskrilla24
 */
public class FileManagement {
    private FileReaderStrategy frs;
//    private FileWriterStrategy fws;
    
    public FileManagement() {}
    
    public FileManagement(FileReaderStrategy frs) {
        this.frs = frs;
    }

    public FileReaderStrategy getFrs() {
        return frs;
    }

    public void setFrs(FileReaderStrategy frs) {
        this.frs = frs;
    }
    
    public void searchTextRecord(int fileNumber) throws IOException {
        frs.searchTextFile(fileNumber);
    }
    
    public String getRecordName() throws NullPointerException {
        return frs.getRecordName();
    }
    
    public void setFilePath(String filePath) throws NullPointerException {
        frs.setFilePath(filePath);
    }
    
    public String getRecordCity() throws NullPointerException {
        return frs.getRecordCity();
    }
    
    public String getRecordState() throws NullPointerException {
        return frs.getRecordState();
    }
    
    public String getRecordStreetAddress() throws NullPointerException {
        return frs.getRecordStreetAddress();
    }
    
    public String getRecordZip() throws NullPointerException {
        return frs.getRecordZip();
    }
}
