import exceptions.CircularReference;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, IOException, InstantiationException, ClassNotFoundException, CircularReference, NoSuchFieldException {
        new Main().run();
    }

    public void run() throws IllegalAccessException, IOException, CircularReference, InstantiationException, NoSuchFieldException, ClassNotFoundException {

        Connector connector = new Connector();
        byte[] data = connector.serialize(null);
        Object anyBean = connector.deserialize(data);
    }
}
