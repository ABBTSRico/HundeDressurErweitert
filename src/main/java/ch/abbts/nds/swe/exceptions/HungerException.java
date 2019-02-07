/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.abbts.nds.swe.exceptions;

/**
 *
 * @author Andreas Wassmer (aw@andreas-wassmer.ch)
 */
public class HungerException extends Exception {

    public HungerException ()
    {
        super("Ich habe Hunger");
    }
}
