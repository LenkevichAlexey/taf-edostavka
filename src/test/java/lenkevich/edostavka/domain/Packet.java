package lenkevich.edostavka.domain;

public class Packet {
    String JWT;
    String MethodName;
    String ServiceNumber;
    Data Data;

    public Packet(String JWT, String methodName, String serviceNumber, lenkevich.edostavka.domain.Data data) {
        this.JWT = JWT;
        MethodName = methodName;
        ServiceNumber = serviceNumber;
        Data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "JWT='" + JWT + '\'' +
                ", MethodName='" + MethodName + '\'' +
                ", ServiceNumber='" + ServiceNumber + '\'' +
                ", Data=" + Data +
                '}';
    }
}
