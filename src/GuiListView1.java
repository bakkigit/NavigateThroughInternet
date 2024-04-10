import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.image.Image;


public class GuiListView1 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("BAKKIPC");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        Internet = new Internet("Internet", stage);
        Banker = new Bank("Banker", stage);


    }

    // -------------------------------------------------------------------------
    ToggleButton knap = new ToggleButton();
    Runtime runtime = Runtime.getRuntime();
    BackgroundFill background_sort = new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY);
    BackgroundFill background_trans = new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY);
    Background backgroundSort = new Background(background_sort);
    Background backgroundTrans = new Background(background_trans);
    Internet Internet;
    Bank Banker;


    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(5);
        pane.setVgap(10);
        pane.setBackground(backgroundSort);

        Image img = new Image("bank.png");
        ImageView view = new ImageView(img);
        view.setFitHeight(100);
        view.setFitWidth(100);




        pane.add(knap, 0, 0);
        knap.setOnAction(event -> this.knapButton());
        knap.setFont(new Font(15));
        pane.setPrefHeight(500);
        knap.setPrefHeight(100);
        pane.setPrefWidth(500);
        knap.setPrefWidth(100);
        knap.setText("Banker");
        knap.setTextFill(Color.BLACK);
        knap.setContentDisplay(ContentDisplay.TOP);
        knap.setGraphic(view);




    }

    public void knapButton() {
//       Internet.showAndWait();
        Banker.showAndWait();

//    String[] s = new String[] {"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe", "https://google.dk"};
//
//    try {
//        runtime.exec(s);
//    }
//    catch (IOException e){
//        e.printStackTrace();
//    }

    }




    // -------------------------------------------------------------------------



    // -------------------------------------------------------------------------


}
