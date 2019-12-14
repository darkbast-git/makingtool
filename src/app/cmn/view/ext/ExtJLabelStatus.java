package app.cmn.view.ext;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class ExtJLabelStatus extends JLabel{

    private static final long serialVersionUID = 1L;
    
    public static final String LEVEL_ERROR = "E";
    public static final String LEVEL_WARN = "W";
    public static final String LEVEL_INFO = "I";
    public static final String LEVEL_DEBUG = "D";
    
    
    public ExtJLabelStatus(){
        LineBorder lineBorder = new LineBorder(Color.BLACK, 1, true);
        setBorder(lineBorder);
        Font font = new Font(Font.SERIF, Font.PLAIN, 10);
        setFont(font);
    }
    
    public void setLevelMsg(String level, String msg){
        if(level == null){
            level = LEVEL_DEBUG;
        }
        
        if(level.equals(LEVEL_ERROR)){
            setForeground(Color.RED);
        }else if(level.equals(LEVEL_WARN)){
            setForeground(Color.ORANGE);            
        }else if(level.equals(LEVEL_INFO)){
            setForeground(Color.BLUE);       
        }else{
            setForeground(Color.BLACK);
        }
        
        setText(msg);
    }
    
}
