import dao.impl.ContactDBImpl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import services.impl.DBContactServiseImpl;
import view.UserInterfaceService;
import view.impl.CmdLineServiceImpl;

import java.io.IOException;

    public class Main{
//public class Main extends Application{
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("scenes/MainWindow.fxml"));
//        primaryStage.setTitle("Phone book");
//        primaryStage.setScene(new Scene(root, 600, 400));
//        primaryStage.show();
//    }

    public static void main(String[] args) throws IOException {
//        UserInterfaceService userInterfaceService = new CmdLineServiceImpl(new CollectionContactServiceImpl());
//        UserInterfaceService userInterfaceService = new CmdLineServiceImpl(new FSContactServiseImpl(new FSContactDaoImpl()));

        UserInterfaceService userInterfaceService = new CmdLineServiceImpl(new DBContactServiseImpl(new ContactDBImpl()));
        userInterfaceService.runMenu();

//        launch(args);

    }
}
