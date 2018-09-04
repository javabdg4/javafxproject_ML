package com.sda.javafx.view;

import com.sda.javafx.Main;
import com.sda.javafx.controller.PersonController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.sda.javafx.model.Person;


import java.io.IOException;
import java.net.URL;

public class PersonView {

    private VBox vBox;
    private Stage stage;

    private ObservableList<Person> personList = FXCollections.observableArrayList();

    public PersonView(Stage stage) {
        this.stage = stage;
    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }

    public PersonView() {
        personList.add(new Person("Ann", "Beck", "27 Coral Av.", "Seattle", "89 500", "22"));
        personList.add(new Person("Beth", "Zack", "5698 Beauty St.", "Old York", "90 070", "47"));
        personList.add(new Person("Chris", "Beck", "341 Tennis Lane", "Old York", "98 030", "87"));
        personList.add(new Person("Danny", "Novak", "2 com.sda.javafx.Main St.", "Warsaw", "00 010", "89"));
        personList.add(new Person("Eve", "Collins-Beck", "55 Park Square", "Seattle", "89 500", "38"));
        personList.add(new Person("Frederic", "Kovalsky", "75 This St.", "Paris", "69 077", "09"));
        personList.add(new Person("George", "Collins", "801 Great St.", "Small Old York", "99 400", "18"));
        personList.add(new Person("Hans", "Zack", "38 Lavender Av.", "Old York", "98 020", "55"));
    }

    public void loadNewPersonView() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("NewPersonView.fxml"));
        VBox newPersonView = null;
        try {
            newPersonView = loader.load();
            Stage newPersonStage = new Stage();
            Scene newPersonScene = new Scene(newPersonView);
            newPersonStage.setScene(newPersonScene);
            newPersonStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void loadView() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/RootView.fxml"));
        try {
            vBox = (VBox) loader.load();
            Scene scene = new Scene(vBox);
            stage.setScene(scene);
            stage.show();

            PersonController personController = loader.getController();

            personController.setPersonView(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
