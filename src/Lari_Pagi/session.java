/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lari_Pagi;

import java.io.InputStream;

/**
 *
 * @author yhan4
 */
public class session {
    
    private static String arti, manfaat, tips;

    private static byte[] img;

//    session arti lari pagi
    public static String getArti() {
        return arti;
    }

    public static void setArti(String arti) {
        session.arti = arti;
    }

//    session manfaat lari pagi
    public static String getManfaat() {
        return manfaat;
    }

    public static void setManfaat(String manfaat) {
        session.manfaat = manfaat;
    }

//    session tips-tips lari pagi
    public static String getTips() {
        return tips;
    }

    public static void setTips(String tips) {
        session.tips = tips;
    }

    
    public static byte[] getImg() {
        return img;
    }

    public static void setImg(byte[] img) {
        session.img = img;
    }
    
}
