package lab4;

import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author dskrilla24
 */
public class InputOutputGUI {
    private FileManagement fm; 
    
    InputOutputGUI() {}
    
    public void startGUI(FileManagement fm) {
        
        try {
           this.fm = fm;
           int recordNum = Integer.parseInt(JOptionPane.showInputDialog(
                   null, "Enter the record you want to search")); 
           fm.searchTextRecord(recordNum);
           JOptionPane.showMessageDialog(null, fm.getRecordName() + "\n" +
                   fm.getRecordStreetAddress() + "\n" + fm.getRecordCity() + "\n"
                    + fm.getRecordState() +
                   "\n" + fm.getRecordZip());
        } catch(IOException ioe) {
            JOptionPane.showMessageDialog(null, ioe.getMessage());
        } catch(NullPointerException npe) {
            JOptionPane.showMessageDialog(null, npe.getMessage());
        }
    }

}
