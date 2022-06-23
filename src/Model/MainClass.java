
package Model;

import javax.swing.*; 

import View.LogInUI;
import View.SpareParts.AddSparePartsUI;

/**
 *
 * @author theCodeMonster
 */
public class MainClass {
    public static void main(String[] args) {
        LogInUI firstUI = new LogInUI();
        firstUI.setVisible(true);
    }
//    java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddSparePartsUI().setVisible(true);
//            }
//        });
}
