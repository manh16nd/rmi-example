package com.mnd;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements IGetStudent {
    private static Registry registry;

    public String getStudent(String studentCode) {
        for (Student student : Constants.STUDENTS) {
            Student current = student.compare(studentCode);
            if (current != null) return current.toString();
        }

        return "Khong tim thay sinh vien";
    }

    public static void startRegistry() throws RemoteException {
        registry = LocateRegistry.createRegistry(Integer.parseInt(Constants.PORT));
    }

    public static void register(Remote obj) throws AlreadyBoundException, RemoteException {
        registry.bind(Constants.SERVICE_NAME, obj);
    }

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        startRegistry();
        Server server = new Server();
        IGetStudent stub = (IGetStudent) UnicastRemoteObject.exportObject(server, Integer.parseInt(Constants.PORT));
        register(stub);

        System.out.println("Server started!");
    }
}
