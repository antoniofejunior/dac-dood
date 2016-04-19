/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood.pojos;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antônio
 */
public class UtilCriptografia {

    public static String criptografar(String original) {
        try {
            MessageDigest algorithm;
            byte messageDigest[];
            algorithm = MessageDigest.getInstance("SHA-256");
            messageDigest = algorithm.digest(original.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UtilCriptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(UtilCriptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
