import ws.BanqueService;

import jakarta.xml.ws.Endpoint;

public class ServerJWs {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:9191/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service deployed on : " + url);
    }
}


















