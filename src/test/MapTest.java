package test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import app.cmn.ConstantsWord;
import app.cmn.dto.ConstDto;

public class MapTest {

    public static void main(String[] args) {

        Map<String, Map<String, ConstDto>> CONSTMAIN = null;
        Map<String, ConstDto> CONTENT_TYPE = null;
        Map<String, ConstDto> CHAR_SET = null;
        Map<String, ConstDto> METHOD = null;

//        if (CONSTMAIN == null){
//            CONSTMAIN = new HashMap<String, Map<String, ConstDto>>();
//            CONTENT_TYPE = new LinkedHashMap<String, ConstDto>();
//            CONTENT_TYPE.put(ConstantsWord.TEXT_PLAIN, new ConstDto("text/plain;", 1));
//            CONTENT_TYPE.put(ConstantsWord.TEXT_CSV, new ConstDto("text/csv;",2));
//            CONSTMAIN.put("MEHTOD",CONTENT_TYPE);
//        }
//        
//        System.out.println(CONSTMAIN);
//        System.out.println(CONSTMAIN.get("MEHTOD"));
//        System.out.println(CONSTMAIN.get("MEHTOD").get(ConstantsWord.TEXT_PLAIN));
    }


}
