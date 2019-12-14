package app.tool.rest;

import java.util.List;

import app.cmn.ConstantsMap;
import app.cmn.dto.ConstDto;

public class RestLogic extends RestView{
	
    

    public RestLogic(){
        initSetting();
    }
    
    private void initSetting(){
        try{
        ConstantsMap constMap = new ConstantsMap();
        cbContentType.setList(constMap.getKey("CONTENT_TYPE"));
        cbMethod.setList(constMap.getKey("METHOD"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
