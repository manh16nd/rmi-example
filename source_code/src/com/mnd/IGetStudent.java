package com.mnd;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IGetStudent extends Remote {
    String getStudent(String studentCode) throws RemoteException;
}
