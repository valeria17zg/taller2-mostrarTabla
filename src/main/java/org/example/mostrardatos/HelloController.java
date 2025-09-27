package org.example.mostrardatos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private Button addButton;

    @FXML
    private TableColumn<Persona, String> sexColumn;

    @FXML
    private TextField sexField;

    @FXML
    private Label sexLabel;

    @FXML
    private Button dataButton;

    @FXML
    private TableView<Persona> dataTable;

    @FXML
    private TableColumn<Persona, String> nameColumn;

    @FXML
    private TextField nameField;

    @FXML
    private Label nameLabel;

    @FXML
    private TableColumn<Persona, String> cityColumn;

    @FXML
    private TextField cityField;

    @FXML
    private Label cityLabel;


    private final ObservableList<Persona> personas = FXCollections.observableArrayList();

    public void initialize(){
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        sexColumn.setCellValueFactory(new PropertyValueFactory<>("sex"));
        cityColumn.setCellValueFactory(new PropertyValueFactory<>("city"));

        dataTable.setItems(personas);
    }

    @FXML
    void onAddButton(ActionEvent event) {
        personas.add(new Persona(nameField.getText().trim(), sexField.getText().trim(), cityField.getText().trim()));
        dataTable.setItems(personas);
        dataTable.refresh();
        nameField.setText("");
        sexField.setText("");
        cityField.setText("");
    }

    @FXML
    void onDataButton(ActionEvent event) {
        String lista="";
        for(Persona persona : personas){
            lista += persona.toString();
        }
            JOptionPane.showMessageDialog(null, lista);
    }
}
