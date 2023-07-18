package lenkevich.edostavka.domain;

public class Data {
    String LoginName;
    String Password;
    int LoginNameTypeId;
    String SourceName;
    String UUID;
    String UserAgent;
    String IpAddress;

    public Data(String loginName, String password, int loginNameTypeId, String sourceName, String UUID, String userAgent, String ipAddress) {
        LoginName = loginName;
        Password = password;
        LoginNameTypeId = loginNameTypeId;
        SourceName = sourceName;
        this.UUID = UUID;
        UserAgent = userAgent;
        IpAddress = ipAddress;

    }

    @Override
    public String toString() {
        return "{" +
                "LoginName='" + LoginName + '\'' +
                ", Password='" + Password + '\'' +
                ", LoginNameTypeId=" + LoginNameTypeId +
                ", SourceName='" + SourceName + '\'' +
                ", UUID='" + UUID + '\'' +
                ", UserAgent='" + UserAgent + '\'' +
                ", IpAddress='" + IpAddress + '\'' +
                '}';
    }
}
