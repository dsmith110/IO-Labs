package lab3;

import java.io.File;

/**
 *
 * @author dskrilla24
 */
public class Startup {
    
    public static void main(String[] args) {
        
        FileManagement fm = new FileManagement("src" + File.separatorChar + "Files"
                + File.separatorChar + "myData.txt");
        
        // Change number to whatever file you want to search
        fm.searchTextRecord(1);
        System.out.println(fm.getRecordCity());
        
        
    }
}
