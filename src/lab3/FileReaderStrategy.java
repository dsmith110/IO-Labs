/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author dskrilla24
 */
public interface FileReaderStrategy {

    public abstract void searchTextFile(int fileNumber);
    public abstract String getRecordName();
    public abstract void setFilePath(String filePath);
    public abstract String getRecordCity();
}
