package app.tool.insertParam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import app.cmn.ConstantsWord;
import app.cmn.dto.ConstDto;
import app.cmn.util.ClipUtil;
import app.cmn.util.GenericUtil;
import app.cmn.view.ext.ExtJLabelStatus;

public class InsertParamLogic extends InsertParamView{

    private static final long serialVersionUID = 1L;

    public InsertParamLogic(){
        setTitle("SQL");
        initSetting();
        listner();
        
    }
    
    private void listner(){
        btnChange.addActionListener(actBtnChange);

        btnRetCopy.addActionListener(actBtnRetCopy);
        btnP2RetCopy.addActionListener(actBtnP2RetCopy);
        btnP2Ret.addActionListener(actBtnP2Ret);
    }
    
    private void initSetting(){
        List<ConstDto> itemList = new ArrayList<ConstDto>();
        itemList.add(new ConstDto(1, ConstantsWord.ITEM_IN, "IN"));
        itemList.add(new ConstDto(1, ConstantsWord.ITEM_OR, "OR"));
        itemList.add(new ConstDto(1, ConstantsWord.ITEM_APO_COMMA, "'?','?'"));
        itemList.add(new ConstDto(1, ConstantsWord.ITEM_ONLY_COMMA, "コンマのみ"));
        lstItem.setList(itemList);
    }
    
    private ActionListener actBtnP2Ret = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selected = lstItem.getSelectedIndex();
            ConstDto dto = lstItem.getItem(selected);
            String param = taChgParam.getText();

            if (GenericUtil.isEmpty(param)){
                lblStatus.setLevelMsg(ExtJLabelStatus.LEVEL_WARN, "EMPTY PARAM");
                return;
            }
            
            String pattern = "";
            
            
            if (chkLine.isSelected()){
                pattern += "\r\n|\n";
            }
            if (chkComma.isSelected()){
                if (GenericUtil.isEmpty(pattern)){
                    pattern = ",";
                }else{
                    pattern = "|,";                    
                }
            }
            if (chkTab.isSelected()){
                if (GenericUtil.isEmpty(pattern)){
                    pattern = "\t";
                }else{
                    pattern = "|\t";                    
                }                
            }
                
            String[] paramArr = param.split(pattern);
            String ret = "";

            String f = null;
            String m = null;
            String b = null;
            switch (dto.key) {
            case ConstantsWord.ITEM_IN:
                f = "(";
                m = "";
                b = ")";
                break;
            case ConstantsWord.ITEM_OR:
                break;
            case ConstantsWord.ITEM_APO_COMMA:
                break;
            case ConstantsWord.ITEM_ONLY_COMMA:
                break;
            default:
                break;
            }
            int cnt = 0;
            for (String p : paramArr){
                if (cnt == 0){
                    ret += f + "'" + p + "'";
                }
                
                if (cnt != 0 && cnt != paramArr.length-1){
                    ret += ",'" + p + "'";
                }
                
                if (cnt == paramArr.length-1){
                    ret += b;                    
                }
                
                cnt++;
            }
                
        }
    };

    /**
     * 결과카피 1페이지
     */
    private ActionListener actBtnRetCopy = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String ret = taRet.getText();
            ClipUtil.setClipBoard(ret);
        }
    };
    
    /**
     * 결과카피 2페이지
     */
    private ActionListener actBtnP2RetCopy = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String ret = taChgRet.getText();
            ClipUtil.setClipBoard(ret);
        }
    };
    
    private ActionListener actBtnChange = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            lblStatus.setLevelMsg(null, "");
            
            // SQL IS NOT NEED.
            String sql = taSql.getText();
            // How many is ? count
            int cntSql = StringUtils.countOccurrencesOf(sql, "?");
            
            // Parameter is not required.
            String param = taParam.getText();
            // How many change parameter?
            String[] arrParam = param.split(",");
            int idx=0;
            for (String p : arrParam){
                if (chkTimeChg.isSelected()){
                    if (p.matches("(\\(Time.*\\)|\\(Date.*\\))")){
                        arrParam[idx] = p.replaceAll("\\.*", "");                        
                    }
                }
                
                arrParam[idx] = p.replaceAll("\\(.*\\)", "");
                idx++;
            }
            int cntParam = arrParam.length;
            
            String ret = null;
            if (cntSql >= cntParam){
                ret = change(sql, arrParam, cntParam);
            }else if (cntParam == 0){
                ret = sql;
            }else{
                ret = change(sql, arrParam, cntSql);
                lblStatus.setLevelMsg(lblStatus.LEVEL_WARN, "置換されないパラメータがあります。");
            }
            
            taRet.setText(ret);
        }
    };
    
    private String change(String sql, String[] param, int loopCnt){
        String ret = sql;
        for (int i=0; i < loopCnt; i++){
            ret = ret.replaceFirst("\\?", param[i].trim());
        }
        return ret;
    }
}
