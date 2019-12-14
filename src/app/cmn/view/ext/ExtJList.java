package app.cmn.view.ext;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import app.cmn.dto.ConstDto;

@SuppressWarnings("rawtypes")
public class ExtJList extends JList{
    private static final long serialVersionUID = 1L;
    
    private List<ConstDto> list;
    private DefaultListModel<String> listModel;
    
    public void setList(List<ConstDto> list){
        this.list = list;
        setModel();
    }
    
    public void setModel(){
        for (ConstDto dto : list){
            listModel.addElement(dto.display);            
        }
    }
    
    public List<ConstDto> getList(){
        return this.list;
    }
    
    public ConstDto getItem(int index){
        return this.list.get(index);
    }
    

}
