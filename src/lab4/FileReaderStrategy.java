/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.io.IOException;



/**
 *
 * @author dskrilla24
 */
public interface FileReaderStrategy {
    final String NPE_ERR_MSG = "Record does not exist";
    final String IO_ERR_MSG = "File not found";
    final String NFE_ERR_MSG = "Entry must be a number";
    
    
    public abstract void searchTextFile(String fileNumber) throws IOException;
    public abstract void setFilePath(String filePath);
    public abstract String getRecordName() throws NullPointerException;
    public abstract String getRecordStreetAddress() throws NullPointerException;
    public abstract String getRecordCity() throws NullPointerException;
    public abstract String getRecordState() throws NullPointerException;
    public abstract String getRecordZip() throws NullPointerException;
}
