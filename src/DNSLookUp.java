
/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class DNSLookUp {
    public static void main(String[] stringArray) {
        try {
            InetAddress inetAddress = InetAddress.getByName(stringArray[1]);
            System.out.println(inetAddress.getHostAddress());
        } catch (UnknownHostException unknownHostException) {
            System.err.println("Unknown host: " + stringArray[1]);
        }
    }
}
