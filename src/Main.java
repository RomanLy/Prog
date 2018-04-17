import dao.ContactDao;
import dao.impl.FSContactDaoImpl;
import services.ContactService;
import services.impl.CollectionContactServiceImpl;
import services.impl.FSContactServiseImpl;
import view.UserInterfaceService;
import view.impl.CmdLineServiceImpl;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        UserInterfaceService uis = new CmdLineServiceImpl(new CollectionContactServiceImpl());
//        uis.runMenu();
        UserInterfaceService userInterfaceService = new CmdLineServiceImpl(new FSContactServiseImpl(new FSContactDaoImpl()));
        userInterfaceService.runMenu();

    }
}
