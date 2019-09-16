package com.Silvia.controller;

import com.Silvia.entity.Item;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class TokoKecilController implements Initializable {

    @FXML
    private TextField txtNama;

    @FXML
    private TextField txtHarga;

    @FXML
    private TextField txtKategori;

    @FXML
    private ComboBox CbKategori;

    @FXML
    private TableView<Item> tabelTokoKecil;

    @FXML
    private TableColumn<Item, String> col01;
    private ObservableList<Item> namaaa;

    @FXML
    private TableColumn<Item, String> col02;
    private ObservableList<Item> hargaaa;

    @FXML
    private TableColumn<Item, String> col03;
    private ObservableList<Item> kategoriii;


    @FXML
    private void tombolSave(ActionEvent actionEvent) {
        Item f = new Item();
        f.setName(txtNama.getText());
        f.setPrice(Integer.parseInt(String.valueOf(txtNama.getText())));
        f.setCategory(CbKategori.getItems());
        namaaa.add(f);

    }

    public void initialize(URL location, ResourceBundle resources) {
        namaaa = FXCollections.observableArrayList();
        tabelTokoKecil.setItems(namaaa);
        col01.setCellValueFactory(data -> {
            Item f = data.getValue();
            return new SimpleStringProperty(f.getName());
        });

        col02.setCellValueFactory(data -> {
            Item f = data.getValue();
            return new SimpleStringProperty(String.valueOf(f.getPrice()));
        });


        col03.setCellValueFactory(data -> {
            Item f = data.getValue();
            return new SimpleStringProperty(f.getCategory().toString());
        });
    }


    @FXML
    private void tombolReset(ActionEvent actionEvent) {
        txtNama.clear();
        txtHarga.clear();
        txtKategori.clear();
    }

    //Ketika User menekan tombol Save Category, tulisan dalam TeksField akan ditambahkan kepada ComboBox
    @FXML
    private void tombolSaveKategori(ActionEvent actionEvent) {
        String S= txtKategori.getText();
        CbKategori.getItems().addAll(S);

    }

}

