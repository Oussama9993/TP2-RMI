package tp.rmi;
import tp.métiers.Compte;

import java.rmi.*;
import java.util.List;

public interface IBanqueRemote extends Remote{
    public double conversion(double montant) throws RemoteException ;
    public Compte consulterCompte (int code) throws RemoteException ;
    public List<Compte> listComptes () throws RemoteException ;

}
