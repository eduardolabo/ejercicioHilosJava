/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3r5;

import javax.swing.DefaultListModel;

/**
 *
 * @author Eduardo
 */
public class Corredores extends DefaultListModel{

    public void addElement(String element) throws Exception {
        
        if(this.getSize()>=5) throw new Exception("Solo puedes agregar 5 corredores");
        else if(element.isEmpty()) throw new Exception("Asegurate de introducir un nombre");
        else super.addElement(new Runner(element));
       
    }
    
}
