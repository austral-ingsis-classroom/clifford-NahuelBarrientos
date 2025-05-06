package edu.austral.ingsis.clifford;

public class ls implements Comand {
    final String[] fileSystem;

    public ls(String[] fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public Result execute(String[] arg) {
        String[] temp = new String[];
        for(int i = 0; i< fileSystem.length;i++){
            temp[i] = fileSystem[i];
        }
        return null;
    }
}