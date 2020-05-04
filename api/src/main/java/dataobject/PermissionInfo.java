package dataobject;

public class PermissionInfo {
    public PermissionInfo(String code) {
        this.pmscode = code;
    }

    private String pmscode;


    public String getPmscode() {
        return pmscode;
    }

    public void setPmscode(String pmscode) {
        this.pmscode = pmscode;
    }
}
