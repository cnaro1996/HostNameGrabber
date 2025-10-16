import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
public class ShowHost {
    public static void main(String[] args) throws Exception {
        InetAddress me = InetAddress.getLocalHost();
        System.out.println("InetAddress.getLocalHost().toString(): " + me); // hostName/ip
        System.out.println();
        System.out.print("Press Enter to exit...");
        try {
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException ignored) {}
    }
}