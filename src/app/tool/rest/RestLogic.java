package app.tool.rest;

import app.cmn.ConstantsMap;

public class RestLogic extends RestView{

    public RestLogic(){
        init();
        initSetting();
    }
    
    private void init(){
        
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
