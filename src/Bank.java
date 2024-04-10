
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;


    public class Bank extends Stage {


        public Bank (String title, Stage owner) {
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

        final private Button nordeaKnap = new Button();
        final private Button SaxoKnap = new Button("Saxo Bank");
        final private Button tilbageKnap = new Button("Tilbage");
        final private Button danskbankKnap = new Button("Danske Bank");
        private Runtime runtime = Runtime.getRuntime();
        BackgroundFill test = new BackgroundFill(Color.BLACK, CornerRadii.EMPTY,Insets.EMPTY);
        BackgroundFill test3 = new BackgroundFill(Color.RED, CornerRadii.EMPTY,Insets.EMPTY);
        Background test1 = new Background(test);
        Background test2 = new Background(test3);






        private void initContent(GridPane pane) {
            // show or hide grid lines
            pane.setGridLinesVisible(false);
            // set padding of the pane
            pane.setPadding(new Insets(20));
            // set horizontal gap between components
            pane.setHgap(10);
            // set vertical gap between components
            pane.setVgap(10);
            pane.setBackground(test1);
            pane.setPrefHeight(500);
            pane.setPrefWidth(500);




            Image nordea = new Image("nordea.png");
            ImageView nordea1 = new ImageView(nordea);
            nordea1.setFitHeight(95);
            nordea1.setFitWidth(95);

            nordeaKnap.setText("Nordea");
            nordeaKnap.setFont(new Font(18));
            pane.add(nordeaKnap, 0, 0);
            nordeaKnap.setContentDisplay(ContentDisplay.TOP);
            nordeaKnap.setTextFill(Color.BLACK);
            nordeaKnap.setGraphic(nordea1);
            nordeaKnap.setOnAction(event -> this.nordea1Knap());



            Image saxo = new Image("SaxoBank.png");
            ImageView saxo1 = new ImageView(saxo);
            saxo1.setFitHeight(95);
            saxo1.setFitWidth(100);
            SaxoKnap.setFont(new Font(18));
            pane.add(SaxoKnap, 2, 0);
            SaxoKnap.setContentDisplay(ContentDisplay.TOP);
            SaxoKnap.setTextFill(Color.BLACK);
            SaxoKnap.setGraphic(saxo1);
            SaxoKnap.setOnAction(event -> this.Saxo1Knap());

            Image danskbank = new Image("DanskeBank.png");
            ImageView danskbank1 = new ImageView(danskbank);
            danskbank1.setFitHeight(95);
            danskbank1.setFitWidth(95);
            danskbankKnap.setFont(new Font(18));
            pane.add(danskbankKnap, 3, 0);
            danskbankKnap.setContentDisplay(ContentDisplay.TOP);
            danskbankKnap.setTextFill(Color.BLACK);
            danskbankKnap.setGraphic(danskbank1);
            danskbankKnap.setOnAction(event -> this.danskebank1Knap());






            Image tilbage = new Image("tilbage.png");
            ImageView tilbage1 = new ImageView(tilbage);
            tilbage1.setFitHeight(20);
            tilbage1.setFitWidth(20);
            tilbageKnap.setFont(new Font(18));
            pane.add(tilbageKnap, 0, 30);
            tilbageKnap.setContentDisplay(ContentDisplay.TOP);
            tilbageKnap.setTextFill(Color.BLACK);
            tilbageKnap.setBackground(test2);
            tilbageKnap.setGraphic(tilbage1);
            tilbageKnap.setOnAction(event -> this.Tilbageknap1());





        }


        public void nordea1Knap() {

            String[] s = new String[] {"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe", "https://identify.nordea.com/?client_id=wFUIfahD8V4EAfbUl45y&scope=ndf%20openid%20agreement%20offline_access&response_type=code&redirect_uri=https%3A%2F%2Fnetbank.nordea.dk%2Flogin%2F&nonce=dh6sNr6zvj87GOF6NuC0wx9UmjiquGpv0aY0ZJCkmMSddKYPtZNAcUAbZe0nPI38&ui_locales=da&code_challenge=UJf2WF5wElOgGtcr1p8QXrBJPz1Lx4iG89oe5w8Le1o&code_challenge_method=S256&state=e30%3D"};

            try {
                runtime.exec(s);
            }
            catch (IOException e){
                e.printStackTrace();
            }



        }



        public void Saxo1Knap() {

            String[] s = new String[] {"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe", "https://www.home.saxo/da-dk/login"};

            try {
                runtime.exec(s);
            }
            catch (IOException e){
                e.printStackTrace();
            }



        }

        public void danskebank1Knap() {

            String[] s = new String[] {"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe", "https://danskebank.dk/site-ressources/login-page/logon"};

            try {
                runtime.exec(s);
            }
            catch (IOException e){
                e.printStackTrace();
            }



        }





        public void Tilbageknap1() {
            Bank.this.close();

        }


    }

