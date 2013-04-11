package lab4;

import java.io.File;

/**
 *
 * @author dskrilla24
 */
public class Startup {
    
    public static void main(String[] args) {
       
       String filePath = "src" + File.separatorChar + "Files"
                + File.separatorChar + "myData.txt";

       new InputOutputGUI().startGUI(new FileManagement(new TextFileReader(filePath)));
        
    }
}
