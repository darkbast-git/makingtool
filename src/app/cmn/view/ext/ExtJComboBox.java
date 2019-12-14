package app.cmn.view.ext;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.JComboBox;

import app.cmn.dto.ConstDto;

public class ExtJComboBox extends JComboBox<String>{
    
    private List<ConstDto> list = null;
    private List<String> keyList = new ArrayList<String>();
    private List<String> displayList = new ArrayList<String>();
    
    public ExtJComboBox(){}
    
    public ExtJComboBox(List<ConstDto> list){
        this.list = new ArrayList<ConstDto>();
        init();
    }
    
    private void init(){
        order();
        keyval();
    }
    
    
    
    private void keyval(){
        for (ConstDto dto : list){
            keyList.add(dto.key);
            displayList.add(dto.display);
            addItem(dto.key);
        }
    }
    
    public void setList(List<ConstDto> list){
        this.list = list;
        init();
    }
    
    public void order(){
        list.sort(new Comparator<ConstDto>() {

            @Override
            public int compare(ConstDto o1, ConstDto o2) {
                if (o1.order.compareTo(o2.order) > 0){
                    return 1;
                }else if (o1.order.compareTo(o2.order) < 0){
                    return -1;
                }
                return 0;
            }
        });
    }

    
    public void getDisplay(){
        for (ConstDto dto : list){
            
//            dto.display;
        }
    }
}
