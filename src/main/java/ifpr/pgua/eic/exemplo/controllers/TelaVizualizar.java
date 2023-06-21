package ifpr.pgua.eic.exemplo.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import ifpr.pgua.eic.exemplo.App;
import ifpr.pgua.eic.exemplo.models.Estacionamento;
import ifpr.pgua.eic.exemplo.models.Veiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class TelaVizualizar implements Initializable {

    @FXML
    private ListView<Veiculo> lsVeiculos;

    @FXML
    private TextArea taDetalhes;

    private Estacionamento estacionamento;

    public TelaVizualizar(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }

    @FXML
    void mostrarDetalhes(MouseEvent event) {
        Veiculo veiculo=lsVeiculos.getSelectionModel().getSelectedItem();
        if (veiculo != null) {
            taDetalhes.clear();
            taDetalhes.appendText(veiculo.getPlaca());
            taDetalhes.appendText(veiculo.getCor());
            
        }
        

    }

    @FXML
    void voltar(ActionEvent event) {
        App.popScreen();

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        lsVeiculos.getItems().clear();
        lsVeiculos.getItems().addAll(estacionamento.listaTodosVeiculos());
    }

}
