package lab2;

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
        frs.searchTextRecord(fileNumber);
    }
    
    public String getTextRecord() {
        return frs.getTextRecord();
    }
    
    public void setFilePath(String filePath) {
        frs.setFilePath(filePath);
    }
}
