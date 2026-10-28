package serveur;

import jakarta.xml.ws.Endpoint;
import service.CalculatriceWS;

public class ServeurJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8089/ws/calculatrice";
        Endpoint.publish(url, new CalculatriceWS());
        System.out.println(" Service Calculatrice publié sur : " + url + "?wsdl");
    }
}