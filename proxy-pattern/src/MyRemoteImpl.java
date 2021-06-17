import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() {
        return "Server says, `'Hey`' ";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.bind("RemoteHello", service);
        } catch (MalformedURLException | AlreadyBoundException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
