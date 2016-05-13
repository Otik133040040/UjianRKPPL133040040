/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log4j.Main;

import com.sun.istack.internal.logging.Logger;

/**
 *
 * @author sb604-12
 */
public class Main {
    private static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Ini adalah debug message");
    }
}
