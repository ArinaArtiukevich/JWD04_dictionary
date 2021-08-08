import console.DictionaryConsoleApplication;
import console.InputProcessor;
import exception.DictionaryConsoleApplicationException;
import exception.ValidatorException;
import service.Dictionary;
import service.impl.DictionaryImpl;

public class Main {
    public static void main(String[] args) throws ValidatorException, DictionaryConsoleApplicationException {
        final Dictionary dictionary = new DictionaryImpl();
        final InputProcessor inputProcessor = new InputProcessor();
        final DictionaryConsoleApplication app = new DictionaryConsoleApplication(dictionary,inputProcessor);
        app.start();
    }
}
