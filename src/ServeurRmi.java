import tp.rmi.IBanqueRmiService;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class ServeurRmi {
    public static void main(String[] args) throws RemoteException {
        try {
            LocateRegistry.createRegistry(1099);//permet de démarrer l'annuaire
            IBanqueRmiService od =new IBanqueRmiService();//instanciation d'un objet de la class IBanqueRmiService
            System.out.println(od.toString());//voir ce qui a été publié dans l'annuaire
            Naming.rebind("rmi://localhost:1099/BK",od);//ajout de l'objet instancié dans l'annuaire
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
