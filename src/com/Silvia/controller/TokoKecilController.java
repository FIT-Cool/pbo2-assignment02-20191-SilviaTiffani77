package com.Silvia.controller;

import com.Silvia.entity.tokoKecilEntity;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class TokoKecilController {

    @FXML
    private TextField txtNama;

    @FXML
    private TextField txtHarga;

    @FXML
    private TextField txtKategori;

    @FXML
    private TableView tabelTokoKecil;

    @FXML
    private TableColumn<tokoKecilEntity, String> col01;
    private ObservableList<tokoKecilEntity> namaaa;

    @FXML
    private TableColumn<tokoKecilEntity, String> col02;
    private ObservableList<tokoKecilEntity> hargaaa;

    @FXML
    private TableColumn<tokoKecilEntity, String> col03;
    private ObservableList<tokoKecilEntity> kategoriii;
    @FXML
    private ComboBox Kategori;


    private void tombolSave(ActionEvent actionEvent) {
        tokoKecilEntity f = new tokoKecilEntity();
        f.setNama(txtNama.getText().trim());
        f.setPrice(Double.parseDouble(txtNama.getText().trim()));
        f.setCategory(ComboBoxCat.getValue);
        namaaa.add(f);
    }

    public void initialize(URL location, ResourceBundle resources) {
        namaaa = FXCollections.observableArrayList();
        tableDepartment.setItems(faculties);
        col01.setCellValueFactory(data -> {
            Fakultas f = data.getValue();
            return new SimpleStringProperty(f.getNama());
        });

        col02.setCellValueFactory(data -> {
            Fakultas f = data.getValue();
            return new SimpleStringProperty(f.getKode());
        });
    }







    @FXML
    private void tombolReset(ActionEvent actionEvent) {
        txtNama.clear();
        txtHarga.clear();
        txtKategori.clear();
    }


}

