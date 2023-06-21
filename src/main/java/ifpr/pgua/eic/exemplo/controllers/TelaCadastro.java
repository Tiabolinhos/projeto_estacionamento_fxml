package ifpr.pgua.eic.exemplo.controllers;

import ifpr.pgua.eic.exemplo.App;
import ifpr.pgua.eic.exemplo.models.Estacionamento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TelaCadastro {

    @FXML
    private TextField tfAnoDeFabricacao;

    @FXML
    private TextField tfCor;

    @FXML
    private TextField tfFabricante;

    @FXML
    private TextField tfModelo;

    @FXML
    private TextField tfPlaca;
    
    private Estacionamento estacionamento;

    public TelaCadastro(Estacionamento estacionamento){
        this.estacionamento = estacionamento;
    }

    @FXML
    void cadastrar(ActionEvent event) {
        String placa =tfPlaca.getText();
        String modelo=tfModelo.getText();
        String cor=tfCor.getText();
        String fabricante=tfFabricante.getText();
        String sAno=tfAnoDeFabricacao.getText();

        int ano=Integer.valueOf(sAno);

        estacionamento.cadastraVeiculo(placa, modelo, fabricante, ano, cor);

        App.popScreen();

    }

    @FXML
    void voltar(ActionEvent event) {
        App.popScreen();

    }

}
