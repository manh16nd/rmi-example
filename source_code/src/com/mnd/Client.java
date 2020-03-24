package com.mnd;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        String studentCode = "16022410";
        Registry registry = LocateRegistry.getRegistry(Constants.HOST, Integer.parseInt(Constants.PORT));
        IGetStudent stub = (IGetStudent) registry.lookup(Constants.SERVICE_NAME);
        String response = stub.getStudent(studentCode);
        System.out.println("Student: " + studentCode);
        System.out.println(response);
    }
}
