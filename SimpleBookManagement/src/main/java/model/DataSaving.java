package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataSaving {

    public void write(Object obj, String uri) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(uri));
            oos.writeObject(obj);
        } catch (IOException ex) {
            Logger.getLogger(DataSaving.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(DataSaving.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Object read(String uri) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(uri));
            Object obj = ois.readObject();
            ois.close();
            return obj;
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(DataSaving.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
