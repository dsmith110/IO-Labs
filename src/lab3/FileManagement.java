package lab3;


/**
 *
 * @author dskrilla24
 */
public class FileManagement {
    private FileReaderStrategy frs;
//    private FileWriterStrategy fws;

    public FileManagement(String filePath) {
        frs = new TextFileReader(filePath);
    }
    
    public void searchTextRecord(int fileNumber) {
        frs.searchTextFile(fileNumber);
    }
    
    public String getRecordName() {
        return frs.getRecordName();
    }
    
    public void setFilePath(String filePath) {
        frs.setFilePath(filePath);
    }
    
    public String getRecordCity() {
        return frs.getRecordCity();
    }
}
