package Controlador;

import Modelo.CRUDestado;
import Modelo.Estado;
import java.util.List;
import javax.swing.JComboBox;

public class EstadoController {
    private CRUDestado modelo;
    
    public EstadoController() {
        this.modelo = new CRUDestado();
    }
    
    public void cargarEstadosEnComboBox(JComboBox<Estado> cboEstado) {
        cboEstado.removeAllItems(); // Limpiar el ComboBox

        List<Estado> listaEstados = modelo.listarEstado();

        for (Estado estado : listaEstados) {
            cboEstado.addItem(estado);
        }
    }
}