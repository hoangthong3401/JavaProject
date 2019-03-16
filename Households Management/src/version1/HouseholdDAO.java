/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jingtian
 */
public class HouseholdDAO implements iHouseholdDAO {

    private static final String PATH = "Households.dat";

    @Override
    public void write(HashMap<String, Household> lsHouseholds) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(PATH));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lsHouseholds);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HouseholdDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HouseholdDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeStream(oos);
            closeStream(fos);
        }
    }

    @Override
    public HashMap<String, Household> read() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(PATH));
            ois = new ObjectInputStream(fis);
            return (HashMap<String, Household>) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HouseholdDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(HouseholdDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeStream(ois);
            closeStream(fis);
        }
        return null;
    }

    @Override
    public void closeStream(InputStream stream) {
        try {
            stream.close();
        } catch (IOException ex) {
            Logger.getLogger(HouseholdDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void closeStream(OutputStream stream) {
        try {
            stream.close();
        } catch (IOException ex) {
            Logger.getLogger(HouseholdDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
