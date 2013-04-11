/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author dskrilla24
 */
public interface FileReaderStrategy {

    public abstract void searchTextRecord(int fileNumber);
    public abstract String getTextRecord();
    public abstract void setFilePath(String filePath);
}
