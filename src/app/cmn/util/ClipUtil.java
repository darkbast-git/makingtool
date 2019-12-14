package app.cmn.util;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class ClipUtil {
    
    public static void setClipBoard(String msg){
        Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(msg);
        clipBoard.setContents(stringSelection, null);
    }   
}
