/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version1.dao;

import version1.dto.Household;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

/**
 *
 * @author jingtian
 */
public interface iHouseholdDAO {

    void write(HashMap<String, Household> lsHouseholds);

    HashMap<String, Household> read();

    void closeStream(InputStream stream);

    void closeStream(OutputStream stream);
}
