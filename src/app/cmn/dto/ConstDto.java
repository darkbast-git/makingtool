package app.cmn.dto;

public class ConstDto {
    public String key;
    public String display;
    public Integer order;
    public ConstDto(){}
    
    public ConstDto(Integer order, String key, String display){
        this.order = order;
        this.key = key;
        this.display = display;
    }
}
