import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.ArrayList;

public class Internet extends Stage {

    public Internet(String title, Stage owner) {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(5);
        this.setMinWidth(200);
        this.setResizable(false);

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    // -------------------------------------------------------------------------

    Runtime runtime = Runtime.getRuntime();
    ToggleButton eboksKnap = new ToggleButton();
    ToggleButton facebookKnap = new ToggleButton();
    BackgroundFill backgroundGray = new BackgroundFill(Color.BROWN, CornerRadii.EMPTY, Insets.EMPTY);
    BackgroundFill test = new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY);
    BackgroundFill background_trans = new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY);
    Background test1 = new Background(test);





    private void initContent(GridPane pane) {

        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setBackground(test1);

        pane.setPrefHeight(500);
        pane.setPrefWidth(500);

        Image eboks = new Image("eboks.png");
        ImageView eboks1 = new ImageView(eboks);
        eboks1.setFitWidth(80);
        eboks1.setFitHeight(80);




        Image facebook = new Image("facebook.png");
        ImageView facebook1 = new ImageView(facebook);
        facebook1.setFitWidth(83);
        facebook1.setFitHeight(83);





        eboksKnap.setText("Eboks");
        eboksKnap.setFont(new Font(20));
        pane.add(eboksKnap, 0, 0);
        eboksKnap.setContentDisplay(ContentDisplay.TOP);
        eboksKnap.setTextFill(Color.BLACK);
        eboksKnap.setGraphic(eboks1);
        eboksKnap.setPrefSize(10, 10);
        eboksKnap.setOnAction(event -> this.eboks1Knap());


        facebookKnap.setText("Facebook");
        facebookKnap.setFont(new Font(18));
        pane.add(facebookKnap, 1, 0);
        facebookKnap.setContentDisplay(ContentDisplay.TOP);
        facebookKnap.setTextFill(Color.BLACK);
        facebookKnap.setGraphic(facebook1);
        facebookKnap.setPrefSize(10, 10);
        facebookKnap.setOnAction(event -> this.facebook1Knap());




    }

    public void eboks1Knap() {
            String[] s = new String[] {"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe", "https://nemlog-in.mitid.dk/login.aspx/noeglekort"};

    try {
        runtime.exec(s);
    }
    catch (IOException e){
        e.printStackTrace();
    }

    }

    public void facebook1Knap() {

        String[] s = new String[] {"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe", "https://www.facebook.com/"};

        try {
            runtime.exec(s);
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }



}

