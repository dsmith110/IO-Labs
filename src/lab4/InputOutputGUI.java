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
        this.fm = fm;
        String recordNumTemp;
        boolean isError = false;
        do {
            try {
                recordNumTemp = (JOptionPane.showInputDialog(
                        null, "Enter the record you want to search"));

                fm.searchTextRecord(recordNumTemp);
                JOptionPane.showMessageDialog(null, fm.getRecordName() + "\n"
                        + fm.getRecordStreetAddress() + "\n" + fm.getRecordCity() + "\n"
                        + fm.getRecordState()
                        + "\n" + fm.getRecordZip());
                isError = false;
            } catch (IOException ioe) {
                isError = true;
                JOptionPane.showMessageDialog(null, ioe.getMessage());  
            } catch (NullPointerException npe) {
                isError = true;
                JOptionPane.showMessageDialog(null, npe.getMessage());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, nfe.getMessage());
                isError = true;
            }
        } while(isError);

    }

}
