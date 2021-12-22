package tp.rmi;

import tp.métiers.Compte;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IBanqueRmiService extends UnicastRemoteObject implements IBanqueRemote  {
    public IBanqueRmiService() throws RemoteException {
        super();
    }

    @Override
    public double conversion(double montant) throws RemoteException {
        return montant*10;
    }

    @Override
    public Compte consulterCompte(int code) throws RemoteException {
        Compte compte=new Compte(1,Math.random()*9000,new Date());

        return compte;
    }

    @Override
    public List<Compte> listComptes() throws RemoteException {
        List<Compte> comptes = new ArrayList<Compte>();
        comptes.add(new Compte(1,Math.random()*9000,new Date()));
        comptes.add(new Compte(2,Math.random()*9000,new Date()));
        comptes.add(new Compte(3,Math.random()*9000,new Date()));

        return comptes;
    }
}
