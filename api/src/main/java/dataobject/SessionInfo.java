package dataobject;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class SessionInfo {
    public SessionInfo() {
        this.createdtime = new Date();
    }

    public SessionInfo(String value, int userid, String clientinfo, String clientip) {
        this();
        this.value = value;
        this.userid = userid;
        this.clientinfo = clientinfo;
        this.clientip = clientip;
    }

    public SessionInfo(String value, int userid) {
        this(value, userid, "", "");
    }

    @XmlElement
    private String value;
    @XmlElement
    private int userid;
    @XmlElement
    private String clientinfo;
    @XmlElement
    private String clientip;
    @XmlElement
    private Date createdtime;

    public String getValue() {
        return value;
    }
    public int getUserid() {
        return userid;
    }
    public String getClientinfo() {
        return clientinfo;
    }
    public String getClientip() {
        return clientip;
    }
}
