package edu.austral.ingsis.clifford;

public interface FileSystem {
    void agregar(FileSystem a);
    void eliminar(FileSystem a);
    void limpiar();
    boolean verificar(FileSystem a);

}


