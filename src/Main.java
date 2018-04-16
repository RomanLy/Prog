import services.impl.CollectionContactServiceImpl;
import view.UserInterfaceService;
import view.impl.CmdLineServiceImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        UserInterfaceService uis = new CmdLineServiceImpl(new CollectionContactServiceImpl());
        uis.runMenu();
    }
}
