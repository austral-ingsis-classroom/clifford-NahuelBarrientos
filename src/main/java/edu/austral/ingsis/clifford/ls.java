package edu.austral.ingsis.clifford;

public class ls implements Comand {
    final String[] fileSystem;

    public ls(String[] fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public Result execute(String[] arg) {
        return null;
    }
}
