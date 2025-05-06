package edu.austral.ingsis.clifford;
public class Archivo implements FileSystem{
    private  String nombre;
    public void SetName(String nombre){
        this.nombre = nombre;
    }
    public String GetName(){
        return  nombre;
    }
    @Override
    public boolean verificar(FileSystem a) {
        return false;
    }
}
