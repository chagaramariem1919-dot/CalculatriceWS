package service;

import jakarta.jws.WebService;

@WebService(endpointInterface = "service.ICalculatrice")
public class CalculatriceWS implements ICalculatrice {

    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double soustraction(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Division par zéro !");
        return a / b;
    }
}