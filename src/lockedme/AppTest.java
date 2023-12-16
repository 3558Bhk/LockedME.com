package lockedme;

import org.junit.Test;

import lockedme.FileOperations;

class AppTest {
    @Test void sortFileNames() {
        FileOperations fileOperations = new FileOperations();
        fileOperations.sortFileNames();
        fileOperations.addFile();
        fileOperations.deleteFile();
        fileOperations.searchFile();
    }
}
