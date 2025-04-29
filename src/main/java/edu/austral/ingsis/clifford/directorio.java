package edu.austral.ingsis.clifford;

import java.util.ArrayList;
import java.util.List;

public class directorio implements FileSystem {
    private final String nombre;
    private final List<FileSystem> lista;
    private final directorio pariente;

    directorio(String nombre, directorio pariente){
        this.nombre = nombre;
        this.pariente = pariente;
        this.lista = new ArrayList<>();
    }

    @Override
    public void agregar(FileSystem c) {
        lista.add(c);
    }

    @Override
    public void eliminar(FileSystem c) {
        lista.remove(c);
    }

    @Override
    public void limpiar() {
        lista.clear();
    }

    @Override
    public boolean verificar(FileSystem c) {
        return true;
    }

    public String getNombre() {
        return nombre;
    }
}