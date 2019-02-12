/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.abbts.nds.swe.tricks;

/**
 *
 * @author Rico Peterhans
 */
public class Jump extends Kunststueck{
    
    public Jump(String name) {
        super(name);
    }
    
    @Override
    public String machKunststück() {
        return "Wuff, ich mache " + name;
    }  
    
}

