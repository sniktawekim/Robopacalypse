
package robopacalypse;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JFrame;

/**
 *
 * @author mwatkins
 */
public class Robopacalypse {
static boolean developerMode = false;
static String libraryPath = "library/";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String launchLoc = System.getProperty("user.dir");
        launchLoc = launchLoc.substring(launchLoc.length()-9, launchLoc.length());
       
        if(launchLoc.compareToIgnoreCase("pacalypse")==0){
            developerMode = true;
        } else{
            libraryPath = "TestLibrary/";
            System.out.println("in jar");
        }
        
          File f = new File("."); // current directory

    File[] files = f.listFiles();
    for (File file : files) {
        if (file.isDirectory()) {
            System.out.print("directory:");
        } else {
            System.out.print("     file:");
        }
        try{
        System.out.println(file.getCanonicalPath());
        }catch(Exception e){
            System.out.println("do nothing");
        }
    }
        
        
        
        
    }
    
}
