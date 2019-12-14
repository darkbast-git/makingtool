package app.cmn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import app.cmn.dto.ConstDto;

public class ConstantsMap {
    private static Map<String, List<ConstDto>> CONSTMAIN = null;

//    private Map<String, ConstDto> CONTENT_TYPE = null;
//    private Map<String, ConstDto> CHAR_SET = null;
    
    public ConstantsMap(){
        if (CONSTMAIN == null){
            CONSTMAIN = new HashMap<String, List<ConstDto>>();
            setContentsType();
//            setCharSet();
            setMethods();
        }
    }
    
    public Map<String, List<ConstDto>> getConstMain(){
        return CONSTMAIN;
    }
    
    public List<ConstDto> getKey(String key){
        return CONSTMAIN.get(key);
    }

    private void setContentsType() {
        List<ConstDto> constDtoList = new ArrayList<ConstDto>();
        int order = 1;
        constDtoList.add(new ConstDto(order++, ConstantsWord.TEXT_PLAIN,"text/plain;"));
        constDtoList.add(new ConstDto(order++, ConstantsWord.TEXT_CSV,"text/csv;"));
        constDtoList.add(new ConstDto(order++, ConstantsWord.TEXT_HTML,"text/html;"));
        constDtoList.add(new ConstDto(order++, ConstantsWord.TEXT_CSS,"text/css;"));
        constDtoList.add(new ConstDto(order++, ConstantsWord.TEXT_JS,"text/javascript;"));
        constDtoList.add(new ConstDto(order++, ConstantsWord.TEXT_XML,"text/xml;"));
        constDtoList.add(new ConstDto(order++, ConstantsWord.APP_PDF,"application/pdf;"));
        constDtoList.add(new ConstDto(order++, ConstantsWord.APP_JSON,"application/json;"));
        constDtoList.add(new ConstDto(order++, ConstantsWord.APP_XML,"application/xml;"));
//        CONTENT_TYPE.put(ConstantsWord.APP_ZIP, "application/zip;");
//        CONTENT_TYPE.put(ConstantsWord.IMG_JPEG, "image/jpeg;");
//        CONTENT_TYPE.put(ConstantsWord.IMG_PNG, "image/png;");
//        CONTENT_TYPE.put(ConstantsWord.IMG_BMP, "image/bmp;");
        CONSTMAIN.put("CONTENT_TYPE",constDtoList);
    }
    
    private void setMethods(){
        List<ConstDto> constDtoList = new ArrayList<ConstDto>();
        int order = 1;
        constDtoList.add(new ConstDto(order++, ConstantsWord.METHOD_POST,"post"));
        constDtoList.add(new ConstDto(order++, ConstantsWord.METHOD_GET,"get"));
//        constDtoList.add(new ConstDto( order++, ConstantsWord.METHOD_PUT,"put"));
//        constDtoList.add(new ConstDto( order++, ConstantsWord.METHOD_DELETE,"delete"));
        CONSTMAIN.put("METHOD",constDtoList);
    }

    private void setCharSet() {
//        CHAR_SET = new LinkedHashMap<String, String>();
//        CHAR_SET.put(ConstantsWord.UTF8, "charset=utf-8;");
//        CHAR_SET.put(ConstantsWord.SHIFT_JIS, "charset=Shift_JIS;");
    }
}
